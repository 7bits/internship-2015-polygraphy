package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.service.registration.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class RegistrationController {
    private static Logger LOG = Logger.getLogger(RegistrationController.class);

    @Autowired
    private RegistrationFirstFormValidator firstFormValidator;

    @Autowired
    private RegistrationSecondFormValidator secondFormValidator;

    @Autowired
    private RequestOnRegistrationValidator requestOnRegistrationValidator;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RegistrationLinkService registrationLinkService;

    @Autowired
    private ContentService contentService;

    //@Secured({"ROLE_ADMIN", "ROLE_POLYGRAPHY"})
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(@RequestParam(value="id") String hash, final Model model) throws ServiceException {

        Integer requestId = registrationLinkService.findRegistrationLink(hash);
        if (requestId!=null) {
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("services", contentService.findAllServices());
            model.addAttribute("firstForm", new RegistrationFirstForm());
            model.addAttribute("secondForm", new RegistrationSecondForm());
            model.addAttribute("hash", hash);
            return "session/registration";
        }
        else
            return "/fffff";
    }

    @RequestMapping(value = "/registration/first-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Object firstStep(@RequestBody RegistrationFirstForm registrationFirstForm,
                            final Model model) throws ServiceException {
        RegistrationErrors registrationErrors = new RegistrationErrors();
        Integer requestId = registrationLinkService.findRegistrationLink(registrationFirstForm.getHash());
        if (requestId!=null) {
            final Map<String, String> errorsFirstForm = firstFormValidator.validate(registrationFirstForm);
            if (errorsFirstForm.size() != 0) {
                registrationErrors.setErrors(errorsFirstForm);
                registrationErrors.setSuccess(false);
                return registrationErrors;
            }
            registrationErrors.setSuccess(true);

        }else {
            registrationErrors.setBase("Ссылка на регистрацию устарела");
            registrationErrors.setSuccess(false);
        }

        return registrationErrors;
    }

    @RequestMapping(value = "/registration/second-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public RegistrationErrors secondStep (@RequestBody RegistrationForm registrationForm,
                                          final Model model) throws ServiceException {
        RegistrationErrors registrationErrors = new RegistrationErrors();
        Integer requestId = registrationLinkService.findRegistrationLink(registrationForm.getFirstStepForm().
                getHash());
        if (requestId!=null) {
            final Map<String, String> errorsSecondForm = secondFormValidator.validate(registrationForm.getSecondStepForm());
            if (errorsSecondForm.size() != 0) {
                registrationErrors.setErrors(errorsSecondForm);
                registrationErrors.setSuccess(false);
                return registrationErrors;
            }

            final Map<String, String> errorsFirstForm = firstFormValidator.validate(registrationForm.getFirstStepForm());
            if (errorsFirstForm.size() != 0) {
                registrationErrors.setErrors(errorsFirstForm);
                registrationErrors.setSuccess(false);
                return registrationErrors;
            }
            registrationErrors.setSuccess(true);
            registrationService.deleteRequestOnRegistration(registrationForm.getFirstStepForm().getHash());
        } else {
            registrationErrors.setBase("Ссылка на регистрацию устарела");
            registrationErrors.setSuccess(false);
        }
        return registrationErrors;
    }

    @RequestMapping(value = "/registration-success", method = RequestMethod.GET)
    public String registrationSuccess (final Model model) {
        return "home/success_registration";
    }


    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public RequestOnRegistrationForm requestOnRegistration(@ModelAttribute RequestOnRegistrationForm form, Model model) throws ServiceException {
        final Map<String, String> errorsRequestForm = requestOnRegistrationValidator.validate(form);
        if (errorsRequestForm.size() != 0) {
            form.setErrors(errorsRequestForm);
            form.setSuccess(false);
            return form;
        }
        form.setSuccess(true);
        registrationService.saveRequestOnRegistration(form);
        return form;
    }
}
