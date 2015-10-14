package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.*;
import it.sevenbits.graphicartsindustry.web.view.response.JsonResponse;
import it.sevenbits.graphicartsindustry.web.view.RequestOnRegistrationModel;
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
    private MessageByLocaleService messageByLocaleService;


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
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "home/about_polygraphy";
        } catch (Exception e) {
            throw new InternalServerErrorException();
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
            response.addData("request", requestOnRegistrationModel);
            return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
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
            response.addData("requestId", requestId);
            return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
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
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
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
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
            return response;
        }
    }
}
