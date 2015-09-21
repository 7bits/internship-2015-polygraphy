package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.RegistrationService;
import it.sevenbits.graphicartsindustry.service.RequestOnRegistrationService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.service.validators.RegistrationFirstFormValidator;
import it.sevenbits.graphicartsindustry.service.validators.RegistrationSecondFormValidator;
import it.sevenbits.graphicartsindustry.service.validators.RequestOnRegistrationValidator;
import it.sevenbits.graphicartsindustry.web.domain.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.domain.response.RegistrationErrors;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationForm;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationSecondForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String loadPageRegistration(@RequestParam(value = "id") String hash, final Model model) throws ServiceException {
        RequestOnRegistrationModel requestOnRegistrationModel =
                requestOnRegistrationService.findRequestOnRegistrationByHash(hash);
        if (requestOnRegistrationModel != null) {
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
                            final Model model) throws ServiceException, RepositoryException {
        RegistrationErrors registrationErrors = new RegistrationErrors();
        RequestOnRegistrationModel requestOnRegistrationModel =
                requestOnRegistrationService.findRequestOnRegistrationByHash(registrationFirstForm.getHash());
        if (requestOnRegistrationModel != null) {
            final Map<String, String> errorsFirstForm = firstFormValidator.validate(registrationFirstForm);
            if (errorsFirstForm.size() != 0) {
                registrationErrors.setErrors(errorsFirstForm);
                registrationErrors.setSuccess(false);
                return registrationErrors;
            }
            registrationErrors.setSuccess(true);
        }else {
            HashMap<String, String> errors = new HashMap<>();
            errors.put("base", "Ссылка на регистрацию устарела");
            registrationErrors.setErrors(errors);
            registrationErrors.setSuccess(false);
        }

        return registrationErrors;
    }

    @RequestMapping(value = "/registration/second-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public RegistrationErrors secondStep (@RequestBody RegistrationForm registrationForm,
                                          final Model model) throws ServiceException, RepositoryException {
        RegistrationErrors registrationErrors = new RegistrationErrors();
        RequestOnRegistrationModel requestOnRegistrationModel =
                requestOnRegistrationService.findRequestOnRegistrationByHash(registrationForm.getFirstForm().getHash());
        if (requestOnRegistrationModel != null) {
            final Map<String, String> errorsSecondForm = secondFormValidator.validate(registrationForm.getSecondForm());
            if (errorsSecondForm.size() != 0) {
                registrationErrors.setErrors(errorsSecondForm);
                registrationErrors.setSuccess(false);
                return registrationErrors;
            }

            final Map<String, String> errorsFirstForm = firstFormValidator.validate(registrationForm.getFirstForm());
            if (errorsFirstForm.size() != 0) {
                registrationErrors.setErrors(errorsFirstForm);
                registrationErrors.setSuccess(false);
                return registrationErrors;
            }
            registrationErrors.setSuccess(true);
            requestOnRegistrationService.removeRequestOnRegistrationByHash(registrationForm.getFirstForm().getHash());
            registrationService.saveRegistrationForm(registrationForm.getFirstForm(), registrationForm.getSecondForm());
        } else {
            HashMap<String, String> errors = new HashMap<>();
            errors.put("base", "Ссылка на регистрацию устарела");
            registrationErrors.setErrors(errors);
            registrationErrors.setSuccess(false);
        }
        return registrationErrors;
    }

    @RequestMapping(value = "/registration-success", method = RequestMethod.GET)
    public String loadSuccessPageRegistration(final Model model) {
        return "home/success/registration";
    }
}
