package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.ServiceException;
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
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final EditingPolygraphyForm polygraphyForm) throws ServiceException {
        LOG.info("SubscriptionFormValidator started for: " + polygraphyForm.toString());
        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(polygraphyForm.getEmail(), errors, "email", "Поле не должно быть пустым");
        validator.shorterThan(polygraphyForm.getEmail(), 255, errors, "email",
                "Поле должно быть короче, чем 255 символов");
//        validatorService.isRegistratedFindCompliance(polygraphyForm.getEmail(), polygraphyForm.getPolygraphyId(),
//                errors, "email", "Такой email уже зарегистрирован");
        validatorService.isRegistrated(polygraphyForm.getEmail(), errors, "email", "Такой email уже зарегистрирован");
        validatorService.isRequested(polygraphyForm.getEmail(), errors, "email",
                "С этого email подана заявка на регистрацию");

        validator.shorterThan(polygraphyForm.getPassword(), 255, errors, "password",
                "Поле должно быть короче, чем 255 символов");
        if (polygraphyForm.getPassword().length() != 0) {
            validator.longerThan(polygraphyForm.getPassword(), 6, errors, "password",
                    "Поле должно быть длинее, чем 6 символов");
        }

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
