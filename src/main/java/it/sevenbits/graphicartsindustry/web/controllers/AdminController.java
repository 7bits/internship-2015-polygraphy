package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.*;
import it.sevenbits.graphicartsindustry.web.domain.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.domain.response.ResponseToChangingConditionDisplayPolygraphy;
import it.sevenbits.graphicartsindustry.web.domain.response.ResponseToRemovingPolygraphy;
import it.sevenbits.graphicartsindustry.web.domain.response.ResponseToRemovingRequestOnRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;

@Controller
public class AdminController {

    @Autowired
    private PolygraphyService polygraphyService;

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private SendingMessagesService sendingMessagesService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        model.addAttribute("requests", requestOnRegistrationService.findAllRequestsOnRegistration());
        model.addAttribute("polygraphies", polygraphyService.findAllPolygraphies());
        return "home/admin";
    }

    @RequestMapping(value = "/admin/send-registration-link", method = RequestMethod.POST)
    @ResponseBody
    public RequestOnRegistrationModel send(
            @RequestParam(value="requestId", defaultValue = "0") Integer requestId,
            final Model model) throws ServiceException, MessagingException {

        String hash = requestOnRegistrationService.generateAndSaveHash(requestId);
        RequestOnRegistrationModel requestOnRegistrationModel =
                requestOnRegistrationService.findRequestOnRegistrationByHash(hash);
        sendingMessagesService.sendingRegistrationLink(requestId);
        return requestOnRegistrationModel;
    }

    @RequestMapping(value = "/admin/remove-request-on-registration", method = RequestMethod.POST)
    @ResponseBody
    public ResponseToRemovingRequestOnRegistration removingRequestOnRegistration(
            @RequestParam(value = "requestId", defaultValue = "0") Integer requestId,
            final Model model) throws ServiceException {
        ResponseToRemovingRequestOnRegistration responseToRemovingRequestOnRegistration =
                new ResponseToRemovingRequestOnRegistration();
        requestOnRegistrationService.removeRequestOnRegistration(requestId);
        responseToRemovingRequestOnRegistration.setSuccess(true);
        responseToRemovingRequestOnRegistration.setRequestId(requestId);
        return responseToRemovingRequestOnRegistration;
    }

    @RequestMapping(value = "/admin/change-condition-display-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public ResponseToChangingConditionDisplayPolygraphy changingConditionDisplayPolygraphy(
            @RequestParam(value = "polygraphyId", defaultValue = "0") Integer polygraphyId,
            @RequestParam(value = "curCondition", defaultValue = "false") Boolean curCondition,
            final Model model) throws ServiceException {
        ResponseToChangingConditionDisplayPolygraphy responseToChangingConditionDisplayPolygraphy =
                new ResponseToChangingConditionDisplayPolygraphy();
        editingPolygraphyService.editConditionDisplayPolygraphy(polygraphyId, curCondition);
        responseToChangingConditionDisplayPolygraphy.setSuccess(true);
        return responseToChangingConditionDisplayPolygraphy;
    }

    @RequestMapping(value = "/admin/remove-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public ResponseToRemovingPolygraphy removingPolygraphy(
            @RequestParam(value = "polygraphyId", defaultValue = "0") Integer polygraphyId,
            final Model model) throws ServiceException {
        ResponseToRemovingPolygraphy responseToRemovingPolygraphy = new ResponseToRemovingPolygraphy();
        polygraphyService.removePolygraphy(polygraphyId);
        responseToRemovingPolygraphy.setSuccess(true);
        return responseToRemovingPolygraphy;
    }
}
