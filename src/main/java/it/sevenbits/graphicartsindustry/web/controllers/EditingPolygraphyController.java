package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.ContentService;
import it.sevenbits.graphicartsindustry.service.EditingPolygraphyService;
import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.service.exception.ForbidenException;
import it.sevenbits.graphicartsindustry.service.exception.ServiceException;
import it.sevenbits.graphicartsindustry.web.exception.InternalServerErrorException;
import it.sevenbits.graphicartsindustry.web.exception.NotFoundException;
import it.sevenbits.graphicartsindustry.web.view.EditingPolygraphyModel;
import it.sevenbits.graphicartsindustry.web.view.response.JsonResponse;
import it.sevenbits.graphicartsindustry.web.view.response.ValidatorResponse;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditingPolygraphyController {

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private EditingPolygraphyService editingPolygraphyService;

    @Autowired
    private ContentService contentService;

    @Autowired
    private UserResolver userResolver;

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String loadPageEditingPolygraphyByAdmin(@PathVariable(value = "id") int polygraphyId, final Model model) {
        try {
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("services", contentService.findAllServices());
            model.addAttribute("editingForm", editingPolygraphyService.findFullInfoAboutPolygraphyByAdmin(polygraphyId));
            model.addAttribute("editingForm.polygraphyId", polygraphyId);
            return "home/editing_polygraphy";
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "home/editing_polygraphy";
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @RequestMapping(value = "/admin/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT,
            produces = "application/json")
    @ResponseBody
    public JsonResponse editPolygraphyByAdmin(@RequestBody EditingPolygraphyForm editingPolygraphyForm,
                                              final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            ValidatorResponse validatorResponse = editingPolygraphyService.editPolygraphyByAdmin(editingPolygraphyForm);
            if (validatorResponse.isSuccess()) {
                response.setSuccess(true);
                return response;
            }
            response.setSuccess(false);
            response.setErrors(validatorResponse.getErrors());
            return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
            return response;
        }
    }

    @RequestMapping(value = "/admin-polygraphy/polygraphy/{id:\\d+}/edit", method = RequestMethod.GET)
    public String loadPageEditingPolygraphyByPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                        final Model model) {
        try {
            model.addAttribute("paymentMethods", contentService.findPaymentMethods());
            model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
            model.addAttribute("services", contentService.findAllServices());
            model.addAttribute("editingForm", editingPolygraphyService.findFullInfoAboutPolygraphyByPolygraphy(
                    polygraphyId, userResolver.getUserId()));
            model.addAttribute("editingForm.polygraphyId", polygraphyId);
            return "home/editing_polygraphy";
        } catch (ServiceException e) {
            model.addAttribute("message", e.getMessage());
            return "home/editing_polygraphy";
        } catch (ForbidenException e) {
            throw new NotFoundException();
        } catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @RequestMapping(value = "/admin-polygraphy/polygraphy/{id:\\d+}/update", method = RequestMethod.PUT,
            produces = "application/json")
    @ResponseBody
    public JsonResponse editPolygraphyByPolygraphy(@PathVariable(value = "id") int polygraphyId,
                                                   @RequestBody EditingPolygraphyForm editingPolygraphyForm,
                                                   final Model model) {
        JsonResponse response = new JsonResponse();
        try {
            ValidatorResponse validatorResponse =
                    editingPolygraphyService.editPolygraphyByPolygraphy(polygraphyId, editingPolygraphyForm);
            if (validatorResponse.isSuccess()) {
                response.setSuccess(true);
                return response;
            }
            response.setSuccess(false);
            response.setErrors(validatorResponse.getErrors());
            return response;
        } catch (ServiceException e) {
            response.setSuccess(false);
            response.addErrors("base", e.getMessage());
            return response;
        } catch (Exception e) {
            response.setSuccess(false);
            response.addErrors("base", messageByLocaleService.getMessage("error.default"));
            return response;
        }
    }

    @RequestMapping(value = "/editing-polygraphy-success", method = RequestMethod.GET)
    public String loadSuccessPageEditingPolygraphy(final Model model) {
        return "home/success_editing_polygraphy";
    }
}
