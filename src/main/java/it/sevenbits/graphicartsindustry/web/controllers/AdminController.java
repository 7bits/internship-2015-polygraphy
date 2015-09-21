package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.*;
import it.sevenbits.graphicartsindustry.web.domain.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.domain.response.*;
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
    public String loadPageAdmin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        model.addAttribute("requests", requestOnRegistrationService.findAllRequestsOnRegistration());
        model.addAttribute("polygraphies", polygraphyService.findAllPolygraphies());
        return "home/admin";
    }

    @RequestMapping(value = "/admin/send-registration-link", method = RequestMethod.POST)
    @ResponseBody
    public RequestOnRegistrationModel sendRegistrationLink(@RequestParam(value = "requestId") Integer requestId,
            final Model model) throws ServiceException {
        return requestOnRegistrationService.sendRegistrationLink(requestId);
    }

    @RequestMapping(value = "/admin/remove-request-on-registration", method = RequestMethod.POST)
    @ResponseBody
    public RemovingRequestOnRegistrationResponse removeRequestOnRegistration(
            @RequestParam(value = "requestId") Integer requestId, final Model model) throws ServiceException {
        RemovingRequestOnRegistrationResponse removingRequestOnRegistrationResponse =
                new RemovingRequestOnRegistrationResponse();
        requestOnRegistrationService.removeRequestOnRegistrationById(requestId);
        removingRequestOnRegistrationResponse.setSuccess(true);
        removingRequestOnRegistrationResponse.setRequestId(requestId);
        return removingRequestOnRegistrationResponse;
    }

    @RequestMapping(value = "/admin/edit-condition-display-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public SuccessResponse editConditionDisplayPolygraphy(@RequestParam(value = "polygraphyId") Integer polygraphyId,
            @RequestParam(value = "curCondition", defaultValue = "false") Boolean curCondition, final Model model)
            throws ServiceException {
        SuccessResponse successResponse = new SuccessResponse();
        editingPolygraphyService.editConditionDisplayPolygraphy(polygraphyId, curCondition);
        successResponse.setSuccess(true);
        return successResponse;
    }

    @RequestMapping(value = "/admin/remove-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public SuccessResponse removingPolygraphy(@RequestParam(value = "polygraphyId") Integer polygraphyId,
            final Model model) throws ServiceException {
        SuccessResponse successResponse = new SuccessResponse();
        polygraphyService.removePolygraphy(polygraphyId);
        successResponse.setSuccess(true);
        return successResponse;
    }
}
