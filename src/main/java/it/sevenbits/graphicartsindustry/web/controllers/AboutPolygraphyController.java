package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.view.response.JsonResponse;
import it.sevenbits.graphicartsindustry.web.view.polygraphy.PolygraphyFullModel;
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
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private PolygraphyService polygraphyService;

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET)
    public String loadPageAboutPolygraphy(@PathVariable(value = "id") int polygraphyId, final Model model) {
        try {
            model.addAttribute("polygraphy", polygraphyService.findPolygraphy(polygraphyId));
            return "home/about_polygraphy";
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "home/about_polygraphy";
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public JsonResponse loadPageAboutPolygraphyJson(@PathVariable(value = "id") int polygraphyId, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            PolygraphyFullModel polygraphyFullModel = polygraphyService.findPolygraphy(polygraphyId);
            response.setSuccess(true);
            response.addData("polygraphy", polygraphyFullModel);
            return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
            return response;
        }
    }
}
