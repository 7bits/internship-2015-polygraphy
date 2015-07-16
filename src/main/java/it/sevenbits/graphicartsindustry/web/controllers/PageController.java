package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.service.PageService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @Autowired
    private PageService service;

    @RequestMapping(value = "/polygraphy/{id}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "id") String idStr, final Model model) throws ServiceException {
        // В модель добавим объект - полиграфию с полной информацией
        //int id=1;
        int id = Integer.parseInt(idStr);
//Добавить обработчик try на 404
        model.addAttribute("page", service.showPolygraphy(id));

        // Так как нет аннотации @ResponseBody, то spring будет искать шаблон по адресу home/index
        // Если шаблона не будет найдено, то вернется 404 ошибка
        return "home/page";
    }
}
