package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutProjectController {

    @RequestMapping(value = "/about-project", method = RequestMethod.GET)
    public String pageAboutProject(final Model model) {
        return "home/about_project";
    }
}
