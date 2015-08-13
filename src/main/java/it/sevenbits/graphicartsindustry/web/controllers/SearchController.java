package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.PolygraphyResponse;
import it.sevenbits.graphicartsindustry.web.domain.registration.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.web.domain.search.SearchForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.SearchService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        // Добавим в модель объект - форма запроса
        model.addAttribute("form", null);

        // Добавим в модель объект - список сервисов
        model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
        // Добавим в модель объект - список методов оплаты
        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        // Добавим в модель объект - список методов доставки
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());


        // Добавим в модель объект - строка, которая говорит о том, была ли найдена хоть одна полиграфия
        model.addAttribute("polygraphyiesIsNull", "");
        // В модель добавим объект - рандомный список полиграфий
        model.addAttribute("polygraphies", searchService.findAll(limitPolygraphy));
        return "home/index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value="query", required = false) String query,
                         @RequestParam(value="services", required = false) List<Integer> services,
                         @RequestParam(value="paymentMethod", required = false, defaultValue = "0") Integer paymentMethod,
                         @RequestParam(value="deliveryMethod", required = false, defaultValue = "0") Integer deliveryMethod,
                         @RequestParam(value="writesTheCheck", required = false, defaultValue = "false") Boolean writesTheCheck,
                         @RequestParam(value="orderByEmail", required = false, defaultValue = "false") Boolean orderByEmail,
                         final Model model) throws ServiceException{
        if (services==null) {
            services = new ArrayList<Integer>();
            services.add(0);
        }
        SearchForm form = new SearchForm(query, services, paymentMethod, deliveryMethod, writesTheCheck,
                orderByEmail);

        // Добавим в модель объект - форма запроса
        model.addAttribute("form", form);

        // В модель добавим объект - список полиграфий
        model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
        // Добавим в модель объект - список методов оплаты
        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        // Добавим в модель объект - список методов доставки
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());

        if (form.getQuery().isEmpty() && form.getServices_id().size() == 0 && form.getPaymentMethod()==0 &&
                form.isWritesTheCheck()==false && form.getDeliveryMethod()==0 &&
                form.isOrderByEmail()==false)
            // В модель добавим объект - рандомный список полиграфий
            model.addAttribute("polygraphies", searchService.findAll(limitPolygraphy));
        else {
            PolygraphyResponse results = new PolygraphyResponse();
            results.setPolygraphies(searchService.findPolygraphies(form));
            if (results.getPolygraphies().size()==0)
                results.setPolygraphiesListIsNull("Ни одна из полиграфий не удовлетворяет " +
                        "требованиям запроса");
            else
                results.setPolygraphiesListIsNull("");
            model.addAttribute("results", results);
        }
        return "home/index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public PolygraphyResponse results (@ModelAttribute SearchForm form, final Model model) throws ServiceException {

        if (form.getServices_id()==null) {
            form.setServices_id(new ArrayList<Integer>(0));
        }
        PolygraphyResponse results = new PolygraphyResponse();
        if (form.getQuery().isEmpty() && form.getServices_id().size()==0 && form.getPaymentMethod()==0 &&
                form.isWritesTheCheck()==false && form.getDeliveryMethod()==0 &&
                form.isOrderByEmail()==false) {
            // В модель добавим объект - рандомный список полиграфий
            results.setPolygraphies(searchService.findAll(limitPolygraphy));
            results.setPolygraphiesListIsNull("");
        }
        else {
            results.setPolygraphies(searchService.findPolygraphies(form));
            if (results.getPolygraphies().size() == 0)
                results.setPolygraphiesListIsNull("Ни одна из полиграфий не удовлетворяет " +
                        "требованиям запроса");
            else
                results.setPolygraphiesListIsNull("");
        }

        return results;
    }


    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.GET)
    public String infoForPolygraphy (RequestOnRegistrationForm form, final Model model) {
        model.addAttribute("request", form);
        return "home/page_with_info_for_polygraphy";
    }

    @RequestMapping(value = "/info-for-polygraphy-success", method = RequestMethod.GET)
    public String infoForPolygraphy (final Model model) {
        return "home/success_request";
    }
}