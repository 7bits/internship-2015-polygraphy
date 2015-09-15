package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PagePolygraphyController {

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public PolygraphyFullModel pageInfoAboutPolygraphyJson(@PathVariable(value = "id") int id, final Model model)
            throws ServiceException {
        return contentService.findPolygraphy(id);
    }

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET)
    public String pageInfoAboutPolygraphy(@PathVariable(value = "id") int id, final Model model) throws
            ServiceException {
        model.addAttribute("polygraphy", contentService.findPolygraphy(id));
        return "home/about_polygraphy";
    }
}
