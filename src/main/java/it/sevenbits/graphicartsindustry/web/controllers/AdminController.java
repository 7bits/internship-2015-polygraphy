package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.admin.ResponseToRemovingRequestOnRegistration;
import it.sevenbits.graphicartsindustry.web.domain.registration.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.service.AdminService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationLinkService;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationService;
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
    private AdminService adminService;

    @Autowired
    private RegistrationLinkService registrationLinkService;

    @Autowired
    private RegistrationService registrationService;

    //@Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        model.addAttribute("requests", registrationService.showRequests());
        return "home/admin";
    }

    //@Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/admin/registration-link", method = RequestMethod.POST)
    @ResponseBody
    public RequestOnRegistrationModel generate(
            @RequestParam(value="requestId", defaultValue = "0") Integer id,
            final Model model) throws ServiceException {

        RequestOnRegistrationModel requestOnRegistration = new RequestOnRegistrationModel();
        String hash = registrationService.generateAndSaveHash(id);
        requestOnRegistration.setHash(hash);
        int requestId = registrationLinkService.findRegistrationLink(hash);
        requestOnRegistration.setId(requestId);

        //RegistrationLink link = registrationLinkService.generateRegistrationLink();
        //model.addAttribute("generate", link.getLinkBasic() + link.getLinkRegistration()
        //        + link.getHash());
        //registrationLinkService.saveRegistrationLink(link);
        //model.addAttribute("requests", registrationService.showRequests());
        return requestOnRegistration;
    }

    @RequestMapping(value = "/admin/registration-link-remove", method = RequestMethod.POST)
    @ResponseBody
    public ResponseToRemovingRequestOnRegistration removingRequestOnRegistration(
            @RequestParam(value = "requestId", defaultValue = "0") Integer requestId,
            final Model model) throws ServiceException {
        ResponseToRemovingRequestOnRegistration responseToRemovingLink = new ResponseToRemovingRequestOnRegistration();
        adminService.removeRequestOnRegistration(requestId);
        responseToRemovingLink.setSuccess(true);
        responseToRemovingLink.setRequestId(requestId);
        return responseToRemovingLink;
    }
}
