package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestOnRegistrationValidator {

    private static final Logger LOG = Logger.getLogger(RequestOnRegistrationValidator.class);

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final RequestOnRegistrationForm form) throws ServiceException {

        LOG.info("RequestOnRegistrationValidator started for: " + form.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.request_on_registration_validator.email.not_empty"));
        validator.shorterThan(form.getEmail(), 255, errors, "email",
                messageByLocaleService.getMessage("error.request_on_registration_validator.email.not_long"));
        validator.isEmail(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.request_on_registration_validator.email.valid"));
        validatorService.isRegistrated(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.request_on_registration_validator.email.is_registrated"));
        validatorService.isRequested(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.request_on_registration_validator.email.is_requested"));
        
        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}

