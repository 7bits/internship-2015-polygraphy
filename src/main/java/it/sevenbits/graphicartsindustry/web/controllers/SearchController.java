package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.PolygraphyResponse;
import it.sevenbits.graphicartsindustry.web.domain.search.SearchForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.PolygraphyService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SearchController {
    private final int limitPolygraphy = 3;
    private final int limitRadioButton = 6;

    @Autowired
    private PolygraphyService polygraphyService;

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
        model.addAttribute("polygraphies", polygraphyService.findAll(limitPolygraphy));
        return "home/index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value="query", required = false) String query,
                         @RequestParam(value="serviceId", required = false, defaultValue = "0") Integer serviceId,
                         @RequestParam(value="paymentMethod", required = false, defaultValue = "0") Integer paymentMethod,
                         @RequestParam(value="deliveryMethod", required = false, defaultValue = "0") Integer deliveryMethod,
                         @RequestParam(value="writesTheCheck", required = false, defaultValue = "false") Boolean writesTheCheck,
                         @RequestParam(value="orderByEmail", required = false, defaultValue = "false") Boolean orderByEmail,
                         final Model model) throws ServiceException{
        SearchForm form = new SearchForm(query, serviceId, paymentMethod, deliveryMethod, writesTheCheck,
                orderByEmail);
        // Добавим в модель объект - форма запроса
        model.addAttribute("form", form);

        // В модель добавим объект - список полиграфий
        model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
        // Добавим в модель объект - список методов оплаты
        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        // Добавим в модель объект - список методов доставки
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());

        if (form.getQuery().isEmpty() && form.getServiceId()==0 && form.getPaymentMethod()==0 &&
                form.getWritesTheCheck()==false && form.getDeliveryMethod()==0 &&
                form.getOrderByEmail()==false)
            // В модель добавим объект - рандомный список полиграфий
            model.addAttribute("polygraphies", polygraphyService.findAll(limitPolygraphy));
        else {
            PolygraphyResponse results = new PolygraphyResponse();
            results.setPolygraphies(polygraphyService.findPolygraphies(form));
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

        PolygraphyResponse results = new PolygraphyResponse();
        if (form.getQuery().isEmpty() && form.getServiceId()==0 && form.getPaymentMethod()==0 &&
                form.getWritesTheCheck()==false && form.getDeliveryMethod()==0 &&
                form.getOrderByEmail()==false) {
            // В модель добавим объект - рандомный список полиграфий
            results.setPolygraphies(polygraphyService.findAll(limitPolygraphy));
            results.setPolygraphiesListIsNull("");
        }
        else {
            results.setPolygraphies(polygraphyService.findPolygraphies(form));
            if (results.getPolygraphies().size() == 0)
                results.setPolygraphiesListIsNull("Ни одна из полиграфий не удовлетворяет " +
                        "требованиям запроса");
            else
                results.setPolygraphiesListIsNull("");
        }

        return results;
    }
}