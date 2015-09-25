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
            throw new ResourceNotFoundException();
        } catch (Exception e) {
            throw new InternalServerErrorExeption(e);
        }
    }

    @RequestMapping(value = "/registration/first-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public JsonResponse firstStep(@RequestBody RegistrationFirstForm registrationFirstForm, final Model model) throws ServiceException {
        JsonResponse response = new JsonResponse();
        try {
            if (requestOnRegistrationService.findRequestOnRegistrationByHash(registrationFirstForm.getHash()) != null) {
                ValidatorResponse validatorResponse =
                        registrationService.validateFirstRegistrationForm(registrationFirstForm);
                if (validatorResponse.isSuccess()) {
                    response.setSuccess(true);
                    return response;
                }
                response.setSuccess(false);
                response.addErrors("validation", validatorResponse);
                return response;
            }
            response.setSuccess(false);
            response.addErrors("base", "Ссылка на регистрацию устарела");
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", "Не удалось осуществить валидацию данных. ");
            return response;
        }
    }

    @RequestMapping(value = "/registration/second-step", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public JsonResponse secondStep (@RequestBody RegistrationForm registrationForm,
                                          final Model model) throws ServiceException {
        JsonResponse response = new JsonResponse();
        try {
            if (requestOnRegistrationService.findRequestOnRegistrationByHash(registrationForm.getFirstForm().getHash()) != null) {
                ValidatorResponse validatorResponse =
                        registrationService.validateSecondRegistrationForm(registrationForm.getSecondForm());
                if (validatorResponse.isSuccess()) {
                    validatorResponse = registrationService.validateFirstRegistrationForm(registrationForm.getFirstForm());
                    if (validatorResponse.isSuccess()) {
                        requestOnRegistrationService.removeRequestOnRegistrationByHash(registrationForm.getFirstForm().getHash());
                        registrationService.saveRegistrationForm(registrationForm.getFirstForm(), registrationForm.getSecondForm());
                        response.setSuccess(true);
                        return response;
                    }
                    response.setSuccess(false);
                    response.addErrors("validationFirstForm", validatorResponse);
                }
                response.setSuccess(false);
                response.addErrors("validationSecondForm", validatorResponse);
                return response;
            }
            response.setSuccess(false);
            response.addErrors("base", "Ссылка на регистрацию устарела");
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", "Не удалось осуществить валидацию данных. ");
            return response;
        }
    }

    @RequestMapping(value = "/registration-success", method = RequestMethod.GET)
    public String loadSuccessPageRegistration(final Model model) {
        return "home/success_registration";
    }
}
