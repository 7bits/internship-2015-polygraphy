package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.web.domain.JsonResponse;
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
            throws ResourceNotFoundException {
        try {
            PolygraphyFullModel polygraphyFullModel = polygraphyService.findPolygraphy(polygraphyId);
            model.addAttribute("polygraphy", polygraphyFullModel);
            return "home/about_polygraphy";
        } catch (Exception e) {
            throw new InternalServerErrorExeption(e);
        }
    }

    @RequestMapping(value = "/polygraphy/{id:\\d+}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public JsonResponse loadPageAboutPolygraphyJson(@PathVariable(value = "id") int polygraphyId, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            PolygraphyFullModel polygraphyFullModel =  polygraphyService.findPolygraphy(polygraphyId);
            response.setSuccess(true);
            response.setData("polygraphy", polygraphyFullModel);
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.setError("base", "Не удалось загрузить данные о полиграфии");
            return response;
        }
    }
}
