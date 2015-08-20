package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.domain.EditingPolygraphyErrors;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyForm;
import it.sevenbits.graphicartsindustry.web.service.ContentService;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.service.editing.EditingPolygraphyFormValidator;
import it.sevenbits.graphicartsindustry.web.service.editing.EditingPolygraphyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class PageEditingInfoAboutPolygraphyController {

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @Autowired
    private EditingPolygraphyFormValidator editingPolygraphyFormValidator;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String pageEditingInfoAboutPolygraphy(@PathVariable(value = "id") int  polygraphyId,
                                                 final Model model) throws ServiceException, RepositoryException {

        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("services", contentService.findAllServices());
        model.addAttribute("editingForm", editingPolygraphyService.showFullInfoAboutPolygraphy(polygraphyId));
        model.addAttribute("editingForm.polygraphyId", polygraphyId);

        return "home/page_editing_info_about_polygraphy";
    }

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public EditingPolygraphyErrors editingInfoAboutPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                                @RequestBody PolygraphyForm form,
                                                                final Model model) throws ServiceException {
        EditingPolygraphyErrors editingPolygraphyErrors = new EditingPolygraphyErrors();

        final Map<String, String> errors = editingPolygraphyFormValidator.validate(form);
        if (errors.size() != 0) {
            editingPolygraphyErrors.setErrors(errors);
            editingPolygraphyErrors.setSuccess(false);
            return editingPolygraphyErrors;
        }

        editingPolygraphyService.saveEditing(form, polygraphyId);
        editingPolygraphyErrors.setSuccess(true);
        return editingPolygraphyErrors;
    }
}
