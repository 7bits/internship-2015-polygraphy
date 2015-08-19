package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageEditingInfoAboutPolygraphyController {

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String pageEditingInfoAboutPolygraphy(final Model model) throws ServiceException {

        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("services", contentService.findAllServices());

        return "home/page_editing_info_about_polygraphy";
    }
}
