package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultExeptionHadler {

    @RequestMapping(value = "/error-404", method = RequestMethod.GET)
    public String loadPageErrorNotFound(final Model model) {
        return "home/404";
    }

    @RequestMapping(value = "/error-500", method = RequestMethod.GET)
    public String loadPageErrorInternalServerError(final Model model) {
        return "home/500";
    }
}
