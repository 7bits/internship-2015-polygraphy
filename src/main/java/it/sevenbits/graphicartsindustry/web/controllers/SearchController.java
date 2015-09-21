package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.SearchService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.forms.SearchForm;
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
    private final int limitPolygraphy = 4;
    private final int limitRadioButton = 4;

    @Autowired
    private SearchService searchService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(final Model model) throws ServiceException {
        model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("form", null);
        model.addAttribute("polygraphies", searchService.findAllAllowedPolygraphy(limitPolygraphy));
        return "home/index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@ModelAttribute SearchForm form, final Model model) throws ServiceException{
        model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("form", form);
        model.addAttribute("polygraphies", searchService.findPolygraphies(form));
        return "home/index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<PolygraphyMinModel> results (@ModelAttribute SearchForm form, final Model model) throws ServiceException {
        return searchService.findPolygraphies(form);
    }
}