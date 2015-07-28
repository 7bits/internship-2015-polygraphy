package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.service.RegistrationLinkService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    private String linkBasic = "http://localhost:9000/registration-link/";
    private int min = 100000;
    private int max = 999999;

    @Autowired
    private RegistrationLinkService service;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(final Model model) throws ServiceException {
        model.addAttribute("generate", "");
        return "home/admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String generate(final Model model) throws ServiceException {

        int number = min + (int)(Math.random() * ((max - min) + 1));
        String strNumber = Integer.toString(number);

        service.saveRegistrationLink(linkBasic + strNumber);

        model.addAttribute("generate", linkBasic + strNumber);
        return "home/admin";
    }
}
