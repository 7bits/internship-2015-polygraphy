package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationFormValidator;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationLinkService;
import it.sevenbits.graphicartsindustry.web.service.registration.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RegistrationController {
    private static Logger LOG = Logger.getLogger(RegistrationController.class);

    @Autowired
    private RegistrationFormValidator validator;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RegistrationLinkService registrationLinkService;

    @Autowired
    private ContentService contentService;

    //@Secured({"ROLE_ADMIN", "ROLE_POLYGRAPHY"})
    @RequestMapping(value = "/registration-link", method = RequestMethod.GET)
    public String registration(@RequestParam(value="id") String link, final Model model) throws ServiceException {
        Boolean y = registrationLinkService.findRegistrationLink(link);
        if (registrationLinkService.findRegistrationLink(link)) {
            // Добавим в модель объект - hash ссылки на регистрацию
            model.addAttribute("hash", link);

            // Добавим в модель объект - список сервисов
            model.addAttribute("services", contentService.findAllServices());
            // Добавим в модель объект - список методов оплаты
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            // Добавим в модель объект - список методов доставки
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());

            // Добавим в модель объект - форма регистрации
            model.addAttribute("registrationUser", new RegistrationFirstForm());
            // Добавим в модель объект - форма регистрации
            model.addAttribute("registration", new RegistrationSecondForm());

            return "session/registration";
        }
        else
            return "/fffff";
    }

    //@Secured({"ROLE_ADMIN", "ROLE_POLYGRAPHY"})
    @RequestMapping(value = "/registration-link", method = RequestMethod.POST)
    public String save(@ModelAttribute RegistrationFirstForm firstForm,
                       @ModelAttribute RegistrationSecondForm secondForm,
                       @RequestParam(value = "hash") String link,
                       final Model model) throws ServiceException {

        final Map<String, String> errors = validator.validate(firstForm);
        if (errors.size() != 0) {

            model.addAttribute("registrationFirstStep", firstForm);
            model.addAttribute("errors", errors);

            return "session/registration";
        }

//        errors = validator.validate(secondForm);
//        if (errors.size() != 0) {
//
//            model.addAttribute("registrationSecondStep", secondForm);
//            model.addAttribute("errors", errors);
//
//            return "session/registration";
//        }

        model.addAttribute("polygraphy", registrationService.saveAll(firstForm, secondForm));
        model.addAttribute("registrationFirstStep", firstForm);
        model.addAttribute("registrationSecondStep", secondForm);

        return "home/success_registration";
    }
}
