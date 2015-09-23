package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SessionController {

    @Autowired
    private UserResolver userResolver;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(HttpServletRequest request) throws ResourceNotFoundException {
        if (userResolver.isUserInRole("ROLE_ANONYMOUS"))
            return "session/login";
        else
            throw new ResourceNotFoundException();
    }
}
