package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.service.RequestOnRegistrationService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.domain.response.SuccessErrorsResponse;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoForPolygraphyController {

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.GET)
    public String loadPageInfoForPolygraphy(final Model model) {
        model.addAttribute("request", new RequestOnRegistrationForm());
        return "home/info_for_polygraphy";
    }

    @RequestMapping(value = "/info-for-polygraphy", method = RequestMethod.POST)
    @ResponseBody
    public SuccessErrorsResponse sendRequestOnRegistration(
            @ModelAttribute RequestOnRegistrationForm requestOnRegistrationForm, Model model) throws ServiceException {
        return requestOnRegistrationService.sendRequestOnRegistration(requestOnRegistrationForm);
    }

    @RequestMapping(value = "/info-for-polygraphy-success", method = RequestMethod.GET)
    public String loadSuccessPageSendingRequestOnRegistration(final Model model) {
        return "home/success/request_on_registration";
    }
}
