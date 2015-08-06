package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationLink;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    private RegistrationLinkService registrationLinkService;

    //@Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        return "home/admin";
    }

    //@Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String generate(final Model model) throws ServiceException {

        RegistrationLink link = registrationLinkService.generateRegistrationLink();
        model.addAttribute("generate", link.getLinkBasic() + link.getLinkRegistration()
                + link.getHash());

        registrationLinkService.saveRegistrationLink(link);

        return "home/admin";
    }
}
