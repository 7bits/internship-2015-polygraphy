package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.service.exception.ServiceException;
import it.sevenbits.graphicartsindustry.web.exception.InternalServerErrorException;
import it.sevenbits.graphicartsindustry.web.forms.SearchForm;
import it.sevenbits.graphicartsindustry.web.view.polygraphy.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.view.response.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private PolygraphyService polygraphyService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(final Model model) {
        try {
            model.addAttribute("services", contentService.findFrequentServices());
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("form", null);
            model.addAttribute("polygraphies", polygraphyService.findAllDisplayPolygraphies());
            return "home/index";
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "home/index";
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String loadPageSearch(@ModelAttribute SearchForm form, final Model model) {
        try {
            model.addAttribute("services", contentService.findFrequentServices());
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("form", form);
            model.addAttribute("polygraphies", polygraphyService.findPolygraphies(form));
            return "home/index";
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "home/index";
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse getResultsSearch(@ModelAttribute SearchForm form, final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            response.addData("polygraphies", polygraphyService.findPolygraphies(form));
            response.setSuccess(true);
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