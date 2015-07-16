package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.SearchForm;
import it.sevenbits.graphicartsindustry.web.service.SearchService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {
    private final int limit = 3;

    @Autowired
    private SearchService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(final Model model) throws ServiceException {
        // В модель добавим объект - список полиграфий
        model.addAttribute("polygraphies", service.findAll(limit));

        // Так как нет аннотации @ResponseBody, то spring будет искать шаблон по адресу home/index
        // Если шаблона не будет найдено, то вернется 404 ошибка
        return "home/index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String search(@ModelAttribute SearchForm form,
                         final Model model) throws ServiceException{

        // В модель добавим объект - список полиграфий удовлетвояющих поиску

        model.addAttribute("polygraphies", service.findPolygraphies(form));
        return "home/index";
    }

}