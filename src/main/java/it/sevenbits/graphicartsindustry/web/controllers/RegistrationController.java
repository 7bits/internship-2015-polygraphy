package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationBasicForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.RegistrationLinkService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    private final int limitRadioButton = 6;

    @Autowired
    private RegistrationLinkService registrationLinkService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/registration-link", method = RequestMethod.GET)
    public String registration(@RequestParam(value="id") String link,final Model model) throws ServiceException {

        if (registrationLinkService.findRegistrationLink(link)) {
            model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
            model.addAttribute("registration", new RegistrationBasicForm());
            return "home/registration";
        }
        else
            return "home/login";
    }

    @RequestMapping(value = "/registration-link", method = RequestMethod.POST)
    public String save(@ModelAttribute RegistrationBasicForm form, final Model model) throws ServiceException {
        model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
        model.addAttribute("registration", form);
        return "home/registration";
    }
}
