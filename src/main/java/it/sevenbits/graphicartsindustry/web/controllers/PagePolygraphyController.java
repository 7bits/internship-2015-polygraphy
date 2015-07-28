package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.search.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PagePolygraphyController {
    @Autowired
    private PolygraphyService service;

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "id") int id, final Model model) throws ServiceException {

        PolygraphyFullModel polygraphy = service.showPolygraphy(id);
        model.addAttribute("polygraphy", polygraphy);

        return "home/page";
    }
}
