package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private UserResolver userResolver;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(@RequestParam(value = "error", required = false) final String error, final Model model) {
        try {
            if (userResolver.isUserInRole("ROLE_ANONYMOUS")) {
                if (error != null) {
                    model.addAttribute("error", messageByLocaleService.getMessage("error.login.validate"));
                }
                return "session/login";
            }
            else
                throw new NotFoundException();
        } catch (NotFoundException e) {
            throw new NotFoundException();
        }
        catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }
}
