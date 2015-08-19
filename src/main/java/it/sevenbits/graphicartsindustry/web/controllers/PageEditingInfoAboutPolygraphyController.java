package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyForm;
import it.sevenbits.graphicartsindustry.web.domain.ResponseEditingPolygraphy;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.EditingPolygraphyService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("editingForm.polygraphyId", polygraphyId);

        return "home/page_editing_info_about_polygraphy";
    }

    @RequestMapping(value = "/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public ResponseEditingPolygraphy editingInfoAboutPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                                @RequestBody PolygraphyForm form,
                                                                final Model model) throws ServiceException {
        ResponseEditingPolygraphy responseEditingPolygraphy = null;
        editingPolygraphyService.saveEditing(form, polygraphyId);
        responseEditingPolygraphy.setSuccess(true);
        return responseEditingPolygraphy;
    }
}
