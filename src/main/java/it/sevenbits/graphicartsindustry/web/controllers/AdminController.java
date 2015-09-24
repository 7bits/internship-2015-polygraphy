package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.EditingPolygraphyService;
import it.sevenbits.graphicartsindustry.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.service.RequestOnRegistrationService;
import it.sevenbits.graphicartsindustry.web.domain.JsonResponse;
import it.sevenbits.graphicartsindustry.web.domain.RequestOnRegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    private PolygraphyService polygraphyService;

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String loadPageAdmin(final Model model) {
        try {
            model.addAttribute("generate", "");
            model.addAttribute("requests", requestOnRegistrationService.findAllRequestsOnRegistration());
            model.addAttribute("polygraphies", polygraphyService.findAllPolygraphies());
            return "home/admin";
        } catch (Exception e) {
            throw new InternalServerErrorExeption(e);
        }
    }

    @RequestMapping(value = "/admin/send-registration-link", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse sendRegistrationLink(@RequestParam(value = "requestId") Integer requestId, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            RequestOnRegistrationModel requestOnRegistrationModel =
                    requestOnRegistrationService.sendRegistrationLink(requestId);
            response.setSuccess(true);
            response.setData("request", requestOnRegistrationModel);
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.setError("base", "Не удалось сгенерировать и отправить ссылку на регистрацию. ");
            return response;
        }
    }

    @RequestMapping(value = "/admin/remove-request-on-registration", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse removeRequestOnRegistration(@RequestParam(value = "requestId") Integer requestId,
                                                    final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            requestOnRegistrationService.removeRequestOnRegistrationById(requestId);
            response.setSuccess(true);
            response.setData("requestId", requestId);
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.setError("base", "Не удалось удалить запрос на регистрацию. ");
            return response;
        }
    }

    @RequestMapping(value = "/admin/edit-condition-display-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse editConditionDisplayPolygraphy(@RequestParam(value = "polygraphyId") Integer polygraphyId,
            @RequestParam(value = "curCondition", defaultValue = "false") Boolean curCondition, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            editingPolygraphyService.editConditionDisplayPolygraphy(polygraphyId, curCondition);
            response.setSuccess(true);
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.setError("base", "Не удалось изменить состояние отображения полиграфии в списке. ");
            return response;
        }
    }

    @RequestMapping(value = "/admin/remove-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse removingPolygraphy(@RequestParam(value = "polygraphyId") Integer polygraphyId,
                                           final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            polygraphyService.removePolygraphy(polygraphyId);
            response.setSuccess(true);
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.setError("base", "Не удалось удалить полиграфию. ");
            return response;
        }
    }
}
