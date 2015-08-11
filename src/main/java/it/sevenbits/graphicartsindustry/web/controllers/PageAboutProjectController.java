package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageAboutProjectController {

    @RequestMapping(value = "/about-project", method = RequestMethod.GET)
    public String pageAboutProject(final Model model) {
        return "home/page_about_project";
    }
}
