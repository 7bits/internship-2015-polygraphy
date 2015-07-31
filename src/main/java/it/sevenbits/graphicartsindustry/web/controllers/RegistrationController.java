package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.RegistrationLinkService;
import it.sevenbits.graphicartsindustry.web.service.RegistrationService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RegistrationLinkService registrationLinkService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/registration-link", method = RequestMethod.GET)
    public String registration(@RequestParam(value="id") String link,final Model model) throws ServiceException {

        if (registrationLinkService.findRegistrationLink(link)) {
            model.addAttribute("hash", link);

            // Добавим в модель объект - список сервисов
            model.addAttribute("services", contentService.findAllServices());
            // Добавим в модель объект - список методов оплаты
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            // Добавим в модель объект - список методов доставки
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());

            model.addAttribute("registration", new RegistrationForm());

            return "home/registration";
        }
        else
            return "error/not_found";
    }

    @RequestMapping(value = "/registration-link", method = RequestMethod.POST)
    public String save(@ModelAttribute RegistrationForm form,
                       @RequestParam(value="hash") String link,
                       final Model model) throws ServiceException {
        if (registrationLinkService.findRegistrationLink(link)) {
            registrationService.saveAll(form);
            return "home/success_registration";
        }
        else
            return "error/not_found";
    }
}
