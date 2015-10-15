package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.service.exception.ServiceException;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EditingUserValidator {

    private static final Logger LOG = Logger.getLogger(EditingUserValidator.class);

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final EditingPolygraphyForm polygraphyForm) throws ServiceException {

        LOG.info("EditingUserValidator started for: " + polygraphyForm.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(polygraphyForm.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.editing_user_validator.email.not_empty"));
        validator.shorterThan(polygraphyForm.getEmail(), 255, errors, "email",
                messageByLocaleService.getMessage("error.editing_user_validator.email.not_long"));
        validator.isEmail(polygraphyForm.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.editing_user_validator.email.valid"));
        validatorService.isRegistratedForParticularPolygraphy(polygraphyForm.getEmail(),
                polygraphyForm.getPolygraphyId(), errors, "email",
                messageByLocaleService.getMessage("error.editing_user_validator.email.is_registrated"));
        validatorService.isRequested(polygraphyForm.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.editing_user_validator.email.is_requested"));

        validator.shorterThan(polygraphyForm.getPassword(), 255, errors, "password",
                messageByLocaleService.getMessage("error.editing_user_validator.password.not_long"));
        if (polygraphyForm.getPassword().length() != 0) {
            validator.longerThan(polygraphyForm.getPassword(), 6, errors, "password",
                    messageByLocaleService.getMessage("error.editing_user_validator.password.least"));
        }

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
