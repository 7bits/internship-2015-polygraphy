package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.service.PagePolygraphyService;
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
    private PagePolygraphyService service;

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "id") int id, final Model model) throws ServiceException {
        // В модель добавим объект - полиграфию с полной информацией

        PolygraphyFullModel polygraphy = service.showPolygraphy(id);
        model.addAttribute("polygraphy", polygraphy);

        return "home/page";
    }
}
