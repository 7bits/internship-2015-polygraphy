package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RequestOnRegistrationModel;
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

import java.util.List;

@Controller
public class AdminController {

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
    public List<RequestOnRegistrationModel> generate(
            @RequestParam(value="requestId", defaultValue = "0") Integer id,
            final Model model) throws ServiceException {

        if (id!=0)
            registrationService.generateAndSaveHash(id);
        //RegistrationLink link = registrationLinkService.generateRegistrationLink();
        //model.addAttribute("generate", link.getLinkBasic() + link.getLinkRegistration()
        //        + link.getHash());
        //registrationLinkService.saveRegistrationLink(link);
        //model.addAttribute("requests", registrationService.showRequests());
        List<RequestOnRegistrationModel> requestOnRegistrationModel = registrationService.showRequests();
        return requestOnRegistrationModel;
    }
}
