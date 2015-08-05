package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationUserForm;
import it.sevenbits.graphicartsindustry.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationUserService registrationUserForm;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RegistrationLinkService registrationLinkService;

    @Autowired
    private ContentService contentService;

    @Secured({"ROLE_ADMIN", "ROLE_POLYGRAPHY"})
    @RequestMapping(value = "/registration-link", method = RequestMethod.GET)
    public String registration(@RequestParam(value="id") String link,final Model model) throws ServiceException {
        Boolean y = registrationLinkService.findRegistrationLink(link);
        if (registrationLinkService.findRegistrationLink(link)) {
            model.addAttribute("hash", link);

            // Добавим в модель объект - список сервисов
            model.addAttribute("services", contentService.findAllServices());
            // Добавим в модель объект - список методов оплаты
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            // Добавим в модель объект - список методов доставки
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());

            model.addAttribute("registrationUser", new RegistrationUserForm());
            model.addAttribute("registration", new RegistrationForm());


            return "session/registration";
        }
        else
            return "/not_found";
    }

    @Secured({"ROLE_ADMIN", "ROLE_POLYGRAPHY"})
    @RequestMapping(value = "/registration-link", method = RequestMethod.POST)
    public String save(@ModelAttribute RegistrationForm form,
                       @ModelAttribute RegistrationUserForm userForm,
                       @RequestParam(value = "hash") String link,
                       final Model model) throws ServiceException {
        if (registrationLinkService.findRegistrationLink(link)) {

            registrationUserForm.register(userForm);
            registrationService.saveAll(form);
            return "home/success_registration";
        }
        else
            return "/not_found";
    }
}
