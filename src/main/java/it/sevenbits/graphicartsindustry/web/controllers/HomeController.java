package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.service.SearchService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private SearchService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(final Model model) throws ServiceException {
        // В модель добавим новый объект - список полиграфий
        model.addAttribute("polygraphies", service.findAll(3));

        // Так как нет аннотации @ResponseBody, то spring будет искать шаблон по адресу home/index
        // Если шаблона не будет найдено, то вернется 404 ошибка
        return "home/index";
    }
}