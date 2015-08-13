package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageEditingInfoAboutPolygraphyController {

    @RequestMapping(value = "/editing-info-about-polygraphy", method = RequestMethod.GET)
    public String pageEditingInfoAboutPolygraphy(final Model model) {
        return "home/page_editing_info_about_polygraphy";
    }
}
