package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.domain.SearchForm;
import it.sevenbits.graphicartsindustry.web.service.SearchService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    private final int limitPolygraphy = 3;
    private final int limitRadioButton = 6;

    @Autowired
    private SearchService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(final Model model) throws ServiceException {
        // Добавим в модель объект - форма запроса
        model.addAttribute("form", null);

        // Добавим в модель объект - список сервисов
        model.addAttribute("services", service.findFrequentServices(limitRadioButton));
        // Добавим в модель объект - список методов оплаты
        model.addAttribute("paymentMethods", service.findPaymentMethods());
        // Добавим в модель объект - список методов доставки
        model.addAttribute("deliveryMethods", service.findDeliveryMethods());


        // Добавим в модель объект - строка, которая говорит о том, была ли найдена хоть одна полиграфия
        model.addAttribute("polygraphyiesIsNull", "");
        // В модель добавим объект - рандомный список полиграфий
        model.addAttribute("polygraphies", service.findAll(limitPolygraphy));
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
        model.addAttribute("services", service.findFrequentServices(limitRadioButton));
        // Добавим в модель объект - список методов оплаты
        model.addAttribute("paymentMethods", service.findPaymentMethods());
        // Добавим в модель объект - список методов доставки
        model.addAttribute("deliveryMethods", service.findDeliveryMethods());

        if (form.getQuery().isEmpty() && form.getServiceId()==0 && form.getPaymentMethod()==0 &&
                form.getWritesTheCheck()==false && form.getDeliveryMethod()==0 &&
                form.getOrderByEmail()==false)
            // В модель добавим объект - рандомный список полиграфий
            model.addAttribute("polygraphies", service.findAll(limitPolygraphy));
        else {
            List<PolygraphyMinModel> polygraphies = service.findPolygraphies(form);
            // В модель добавим объект - список полиграфий удовлетвояющих поиску
            model.addAttribute("polygraphies", polygraphies);
            // Добавим в модель объект - строка, которая говорит о том, была ли найдена хоть одна полиграфия
            if (polygraphies.size() == 0)
                model.addAttribute("polygraphyiesIsNull", "Ни одна из полиграфий не удовлетворяет " +
                        "требованиям запроса");
            else
                model.addAttribute("polygraphyiesIsNull", "");
        }
        return "home/index";
    }

    @RequestMapping(value = "/results", method = RequestMethod.POST)
    public String results (@ModelAttribute SearchForm form, final Model model) throws ServiceException {

        if (form.getQuery().isEmpty() && form.getServiceId()==0 && form.getPaymentMethod()==0 &&
                form.getWritesTheCheck()==false && form.getDeliveryMethod()==0 &&
                form.getOrderByEmail()==false)
            // В модель добавим объект - рандомный список полиграфий
            model.addAttribute("polygraphies", service.findAll(limitPolygraphy));
        else {
            List<PolygraphyMinModel> polygraphies = service.findPolygraphies(form);
            // В модель добавим объект - список полиграфий удовлетвояющих поиску
            model.addAttribute("polygraphies", polygraphies);
            // Добавим в модель объект - строка, которая говорит о том, была ли найдена хоть одна полиграфия
            if (polygraphies.size() == 0)
                model.addAttribute("polygraphyiesIsNull", "Ни одна из полиграфий не удовлетворяет " +
                        "требованиям запроса");
            else
                model.addAttribute("polygraphyiesIsNull", "");
        }
        return "home/index";

    }
}