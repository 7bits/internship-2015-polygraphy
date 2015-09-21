package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.EditingPolygraphyService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.domain.response.SuccessErrorsResponse;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditingPolygraphyController {

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @Autowired
    private ContentService contentService;

    @Autowired
    private UserResolver userResolver;


    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String loadPageEditingPolygraphyByAdmin(@PathVariable(value = "id") int polygraphyId,
                                                   final Model model) throws ServiceException {
        model.addAttribute("paymentMethods", contentService.findPaymentMethods());
        model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
        model.addAttribute("services", contentService.findAllServices());
        model.addAttribute("editingForm", editingPolygraphyService.findFullInfoAboutPolygraphyByAdmin(polygraphyId));
        model.addAttribute("editingForm.polygraphyId", polygraphyId);
        return "home/editing_polygraphy";
    }

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public SuccessErrorsResponse editPolygraphyByAdmin(@RequestBody EditingPolygraphyForm editingPolygraphyForm,
                                                       final Model model) throws ServiceException {
        return editingPolygraphyService.editPolygraphyByAdmin(editingPolygraphyForm);
    }

    @RequestMapping(value = "/admin-polygraphy/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String loadPageEditingPolygraphyByPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                        final Model model) throws ServiceException {
        if (userResolver.getUsername().equals(editingPolygraphyService.findUserEmailByPolygraphyId(polygraphyId))) {
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("services", contentService.findAllServices());
            model.addAttribute("editingForm", editingPolygraphyService.findFullInfoAboutPolygraphyByPolygraphy(polygraphyId));
            model.addAttribute("editingForm.polygraphyId", polygraphyId);
            return "home/editing_polygraphy";
        }
        return "/fffff";
    }

    @RequestMapping(value = "/admin-polygraphy/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public SuccessErrorsResponse editPolygraphyByPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                            @RequestBody EditingPolygraphyForm editingPolygraphyForm,
                                                            final Model model) throws ServiceException {
        return editingPolygraphyService.editPolygraphyByPolygraphy(polygraphyId, editingPolygraphyForm);
    }

    @RequestMapping(value = "/editing-polygraphy-success", method = RequestMethod.GET)
    public String loadSuccessPageEditingPolygraphy(final Model model) {
        return "home/success/editing_polygraphy";
    }
}
