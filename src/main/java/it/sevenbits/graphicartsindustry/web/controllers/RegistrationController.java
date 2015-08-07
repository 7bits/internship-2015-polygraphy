package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.RegistrationResponse;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
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
    @RequestMapping(value = "/registration-link", method = RequestMethod.GET)
    public String registration(@RequestParam(value="id") String hash, final Model model) throws ServiceException {
        Integer requestId = registrationLinkService.findRegistrationLink(hash);
        if (requestId!=null) {

            RegistrationResponse registrationResponse = new RegistrationResponse();
            registrationResponse.setPaymentMethods(contentService.findPaymentMethods());
            registrationResponse.setDeliveryMethods(contentService.findDeliveryMethods());
            registrationResponse.setServices(contentService.findAllServices());
            registrationResponse.setFirstForm(new RegistrationFirstForm());
            registrationResponse.setSecondForm(new RegistrationSecondForm());
            registrationResponse.setHash(hash);

            model.addAttribute("registrationResponse", registrationResponse);

            return "session/registration";
        }
        else
            return "/fffff";
    }

    //@Secured({"ROLE_ADMIN", "ROLE_POLYGRAPHY"})
    @RequestMapping(value = "/registration-link", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@ModelAttribute RegistrationResponse registrationResponse,
                       final Model model) throws ServiceException {

        final Map<String, String> errorsFirstForm = firstFormValidator.validate(registrationResponse.getFirstForm());
        if (errorsFirstForm.size() != 0) {
            registrationResponse.setErrors(errorsFirstForm);
            return registrationResponse;
        }

        final Map<String, String> errorsSecondForm = secondFormValidator.validate(registrationResponse.getSecondForm());
        if (errorsSecondForm.size() != 0) {
            registrationResponse.setErrors(errorsSecondForm);
            return registrationResponse;
        }

        registrationService.deleteRequestOnRegistration(registrationResponse.getHash());
        return "home/index";
    }

    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public RequestOnRegistrationForm requestOnRegistration(RequestOnRegistrationForm form, Model model) throws ServiceException {
        final Map<String, String> errorsRequestForm = requestOnRegistrationValidator.validate(form);
        if (errorsRequestForm.size() != 0) {
            form.setErrors(errorsRequestForm);
            form.setSuccess(false);
            return form;
        }        form.setSuccess(true);
        registrationService.saveRequestOnRegistration(form);
        return form;
    }
}
