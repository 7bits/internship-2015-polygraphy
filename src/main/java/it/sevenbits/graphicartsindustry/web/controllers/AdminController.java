package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.admin.ResponseToChangingConditionDisplayPolygraphy;
import it.sevenbits.graphicartsindustry.web.domain.admin.ResponseToRemovingPolygraphy;
import it.sevenbits.graphicartsindustry.web.domain.admin.ResponseToRemovingRequestOnRegistration;
import it.sevenbits.graphicartsindustry.web.domain.request.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.service.AdminService;
import it.sevenbits.graphicartsindustry.web.service.SendingMessagesService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationService;
import it.sevenbits.graphicartsindustry.web.service.request.RequestOnRegistrationService;
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
    private AdminService adminService;

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private SendingMessagesService sendingMessagesService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        model.addAttribute("requests", adminService.showAllRequests());
        model.addAttribute("polygraphies", adminService.showAllPolygraphy());
        return "home/admin";
    }

    @RequestMapping(value = "/admin/send-registration-link", method = RequestMethod.POST)
    @ResponseBody
    public RequestOnRegistrationModel generate(
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
        adminService.removeRequestOnRegistration(requestId);
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
        adminService.changeConditionDisplayPolygraphy(polygraphyId, curCondition);
        responseToChangingConditionDisplayPolygraphy.setSuccess(true);
        return responseToChangingConditionDisplayPolygraphy;
    }

    @RequestMapping(value = "/admin/remove-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public ResponseToRemovingPolygraphy removingPolygraphy(
            @RequestParam(value = "polygraphyId", defaultValue = "0") Integer polygraphyId,
            final Model model) throws ServiceException {
        ResponseToRemovingPolygraphy responseToRemovingPolygraphy = new ResponseToRemovingPolygraphy();
        adminService.removePolygraphy(polygraphyId);
        responseToRemovingPolygraphy.setSuccess(true);
        return responseToRemovingPolygraphy;
    }
}
