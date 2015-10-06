package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationSecondForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegistrationSecondFormValidator {

    private static final Logger LOG = Logger.getLogger(RegistrationSecondFormValidator.class);

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private CommonFieldValidator validator;

    public HashMap<String, String> validate(final RegistrationSecondForm form) {

        LOG.info("RegistrationSecondFormValidator started for: " + form.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullListId(form.getServices(), errors, "services",
                messageByLocaleService.getMessage("error.registration_second_form_validator.services.not_empty"));

        validator.isNotNullListId(form.getPaymentMethods(), errors, "paymentMethods",
                messageByLocaleService.getMessage("error.registration_second_form_validator.payment_methods.not_empty"));

        validator.isNotNullListId(form.getDeliveryMethods(), errors, "deliveryMethods",
                messageByLocaleService.getMessage("error.registration_second_form_validator.delivery_methods.not_empty"));

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
