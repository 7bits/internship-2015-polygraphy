package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyFullModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutPolygraphyController {

    @Autowired
    private PolygraphyService polygraphyService;

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET)
    public String loadPageAboutPolygraphy(@PathVariable(value = "id") int polygraphyId, final Model model)
            throws ServiceException {
        model.addAttribute("polygraphy", polygraphyService.findPolygraphy(polygraphyId));
        return "home/about_polygraphy";
    }

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public PolygraphyFullModel loadPageAboutPolygraphyJson(@PathVariable(value = "id") int polygraphyId,
                                                           final Model model) throws ServiceException {
        return polygraphyService.findPolygraphy(polygraphyId);
    }
}
