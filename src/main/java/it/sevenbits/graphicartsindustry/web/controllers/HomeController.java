package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HomeController {
    private String listPolygraphy[] = {"Оригинал", "Марка", "Селбс"};

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(final Model model) {
        // В модель добавим новый объект - список полиграфий

        model.addAttribute("listpolygraphy", listPolygraphy);
        // Так как нет аннотации @ResponseBody, то spring будет искать шаблон по адресу home/index
        // Если шаблона не будет найдено, то вернется 404 ошибка
        return "home/index";
    }

    @RequestMapping(value = "/", method = POST)
    public String getPolygraphy(@ModelAttribute String polygraphy, final Model model) {
        // В запросе пришло название полиграфии. Проверим, существует ли такая полиграфия
        // Если существует, то отправим в модель этот объект.
        for (int index = 0; index < 3; index++)
            if (polygraphy == listPolygraphy[index]) {
                model.addAttribute("detected", listPolygraphy[index]);
            }
        model.addAttribute("detected", "");
        return "home/index";
    }
}