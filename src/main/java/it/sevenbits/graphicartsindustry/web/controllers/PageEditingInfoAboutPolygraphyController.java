package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.EditingPolygraphyService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageEditingInfoAboutPolygraphyController {

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String pageEditingInfoAboutPolygraphy(@PathVariable(value = "id") int  polygraphyId,
                                                 final Model model) throws ServiceException, RepositoryException {

        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("services", contentService.findAllServices());
        model.addAttribute("editingForm", editingPolygraphyService.showFullInfoAboutPolygraphy(polygraphyId));

        return "home/page_editing_info_about_polygraphy";
    }
}
