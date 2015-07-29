package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.core.domain.RegistrationLink;
import it.sevenbits.graphicartsindustry.web.service.RegistrationLinkService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {


    @Autowired
    private RegistrationLinkService service;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        return "home/admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String generate(final Model model) throws ServiceException {

        RegistrationLink link = service.generateRegistrationLink();
        model.addAttribute("generate", link.getLinkBasic() + link.getLinkRegistration()
                + link.getHash());

        service.saveRegistrationLink(link);

        return "home/admin";
    }
}
