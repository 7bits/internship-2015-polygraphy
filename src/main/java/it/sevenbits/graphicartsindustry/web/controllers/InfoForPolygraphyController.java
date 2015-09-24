package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.RequestOnRegistrationService;
import it.sevenbits.graphicartsindustry.web.view.response.JsonResponse;
import it.sevenbits.graphicartsindustry.web.view.response.ValidatorResponse;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoForPolygraphyController {

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.GET)
    public String loadPageInfoForPolygraphy(final Model model) {
        try {
            model.addAttribute("request", new RequestOnRegistrationForm());
            return "home/info_for_polygraphy";
        } catch (Exception e) {
            throw new InternalServerErrorExeption(e);
        }
    }

    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse saveRequestOnRegistration(@ModelAttribute RequestOnRegistrationForm requestOnRegistrationForm,
                                                  final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            ValidatorResponse validatorResponse =
                    requestOnRegistrationService.saveRequestOnRegistration(requestOnRegistrationForm);
            if (validatorResponse.isSuccess()) {
                response.setSuccess(true);
                return response;
            }
            response.setSuccess(false);
            response.setErrors("validation", validatorResponse.getErrors());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.setErrors("base", "Не удалось сохранить запрос на регистрацию. ");
            return response;
        }
    }

    @RequestMapping(value = "/info-for-polygraphy-success", method = RequestMethod.GET)
    public String loadSuccessPageSendingRequestOnRegistration(final Model model) {
        return "home/success_request_on_registration";
    }
}
