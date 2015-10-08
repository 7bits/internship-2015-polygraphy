package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
public class LanguageController {

    @Autowired
    private LocaleResolver localeResolver;

    @RequestMapping(value = "/language", method = RequestMethod.POST)
    public String pageLanguage(@RequestParam(value = "language") String language, HttpServletRequest request,
                               HttpServletResponse response) {
        localeResolver.setLocale(request, response, new Locale(language));
        return "home/about_project";
    }
}
