package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.service.validators.EditingPolygraphyFormByAdminValidator;
import it.sevenbits.graphicartsindustry.service.validators.EditingPolygraphyFormByPolygraphyValidator;
import it.sevenbits.graphicartsindustry.service.EditingPolygraphyService;
import it.sevenbits.graphicartsindustry.web.domain.response.EditingPolygraphyErrors;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PageEditingInfoAboutPolygraphyController {

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @Autowired
    private EditingPolygraphyFormByAdminValidator editingPolygraphyFormByAdminValidator;

    @Autowired
    private EditingPolygraphyFormByPolygraphyValidator editingPolygraphyFormByPolygraphyValidator;

    @Autowired
    private UserResolver userResolver;

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String pageEditingInfoAboutPolygraphyByAdmin(@PathVariable(value = "id") int  polygraphyId,
                                                 final Model model) throws ServiceException, RepositoryException {

        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("services", contentService.findAllServices());
        model.addAttribute("editingForm", editingPolygraphyService.showFullInfoAboutPolygraphyByAdmin(polygraphyId));
        model.addAttribute("editingForm.polygraphyId", polygraphyId);

        return "home/editing_polygraphy";
    }

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public EditingPolygraphyErrors editingInfoAboutPolygraphyByAdmin(@PathVariable(value = "id") int polygraphyId,
                                                                @RequestBody EditingPolygraphyForm form,
                                                                final Model model) throws ServiceException, RepositoryException {
        EditingPolygraphyErrors editingPolygraphyErrors = new EditingPolygraphyErrors();

        final Map<String, String> errors = editingPolygraphyFormByAdminValidator.validate(form);
        if (errors.size() != 0) {
            editingPolygraphyErrors.setErrors(errors);
            editingPolygraphyErrors.setSuccess(false);
            return editingPolygraphyErrors;
        }

        editingPolygraphyService.saveEditingPolygraphyByAdmin(form);
        editingPolygraphyErrors.setSuccess(true);
        return editingPolygraphyErrors;
    }

    @RequestMapping(value = "/admin-polygraphy/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String pageEditingInfoAboutPolygraphyByPolygraphy(@PathVariable(value = "id") int  polygraphyId,
                                                 final Model model) throws ServiceException, RepositoryException {
        if (userResolver.getUsername().equals(editingPolygraphyService.findUserEmailByPolygraphyId(polygraphyId))) {
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("services", contentService.findAllServices());
            model.addAttribute("editingForm", editingPolygraphyService.showFullInfoAboutPolygraphyByPolygraphy(polygraphyId));
            model.addAttribute("editingForm.polygraphyId", polygraphyId);
            return "home/editing_polygraphy";
        }
        return "/fffff";
    }

    @RequestMapping(value = "/admin-polygraphy/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public EditingPolygraphyErrors editingInfoAboutPolygraphyByPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                                     @RequestBody EditingPolygraphyForm form,
                                                                     final Model model) throws ServiceException, RepositoryException {
        EditingPolygraphyErrors editingPolygraphyErrors = new EditingPolygraphyErrors();
        if (userResolver.getUsername().equals(editingPolygraphyService.findUserEmailByPolygraphyId(polygraphyId))) {
            final Map<String, String> errors = editingPolygraphyFormByPolygraphyValidator.validate(form);
            if (errors.size() != 0) {
                editingPolygraphyErrors.setErrors(errors);
                editingPolygraphyErrors.setSuccess(false);
                return editingPolygraphyErrors;
            }
            editingPolygraphyService.saveEditingPolygraphyByPolygraphy(form);
            editingPolygraphyErrors.setSuccess(true);
            return editingPolygraphyErrors;
        }
        HashMap<String, String> errors = new HashMap<>();
        errors.put("base", "Ссылка на изменение устарела");
        editingPolygraphyErrors.setErrors(errors);
        editingPolygraphyErrors.setSuccess(false);
        return editingPolygraphyErrors;
    }

    @RequestMapping(value = "/success-editing", method = RequestMethod.GET)
    public String pageSuccessEditing(final Model model) {
        return "home/success_editing";
    }
}
