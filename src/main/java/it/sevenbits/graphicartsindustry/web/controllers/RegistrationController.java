package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.RegistrationService;
import it.sevenbits.graphicartsindustry.service.RequestOnRegistrationService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationForm;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.view.response.JsonResponse;
import it.sevenbits.graphicartsindustry.web.view.response.ValidatorResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {
    private static Logger LOG = Logger.getLogger(RegistrationController.class);

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String loadPageRegistration(@RequestParam(value = "id") String hash, final Model model) {
        try {
            if (requestOnRegistrationService.findRequestOnRegistrationByHash(hash) != null) {
                model.addAttribute("paymentMethods", contentService.findPaymentMethods());
                model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
                model.addAttribute("services", contentService.findAllServices());
                model.addAttribute("firstForm", new RegistrationFirstForm());
                model.addAttribute("secondForm", new RegistrationSecondForm());
                model.addAttribute("hash", hash);
                return "session/registration";
            }
            throw new NotFoundException();
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "session/registration";
        } catch (Exception e) {
            throw new InternalServerErrorExeption();
        }
    }

    @RequestMapping(value = "/registration/first-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public JsonResponse firstStep(@RequestBody RegistrationFirstForm registrationFirstForm, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
             ValidatorResponse validatorResponse =
                     registrationService.validateFirstRegistrationForm(registrationFirstForm);
             if (validatorResponse.isSuccess()) {
                 response.setSuccess(true);
                 return response;
             }
             response.setSuccess(false);
             response.setErrors(validatorResponse.getErrors());
             return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", "Произошла ошибка. Мы уже работаем над ней. ");
            return response;
        }
    }

    @RequestMapping(value = "/registration/second-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public JsonResponse secondStep (@RequestBody RegistrationForm registrationForm, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
             ValidatorResponse validatorResponse = registrationService.validateAndSaveRegistrationForm(registrationForm);
             if (validatorResponse.isSuccess()) {
                 response.setSuccess(true);
                 return response;
             }
             response.setSuccess(false);
             response.setErrors(validatorResponse.getErrors());
             return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", "Произошла ошибка. Мы уже работаем над ней. ");
            return response;
        }
    }

    @RequestMapping(value = "/registration-success", method = RequestMethod.GET)
    public String loadSuccessPageRegistration(final Model model) {
        return "home/success_registration";
    }
}
