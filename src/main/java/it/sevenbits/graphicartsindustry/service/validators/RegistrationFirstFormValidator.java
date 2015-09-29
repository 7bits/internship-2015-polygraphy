package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationFirstForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegistrationFirstFormValidator {

    private static final Logger LOG = Logger.getLogger(RegistrationFirstFormValidator.class);

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final RegistrationFirstForm form) throws ServiceException {

        LOG.info("SubscriptionFormValidator started for: " + form.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getEmail(), errors, "email", "Поле не должно быть пустым");
        validator.isEmail(form.getEmail(), errors, "email", "Введите правильный email");
        validator.shorterThan(form.getEmail(), 255, errors, "email", "Поле должно быть короче, чем 255 символов");
        validatorService.isRegistrated(form.getEmail(), errors, "email", "Такой email уже зарегистрирован");

        validator.isNotNullOrEmpty(form.getPassword(), errors, "password", "Поле не должно быть пустым");
//        validator.isNotNullOrEmpty(form.getPasswordConfirmation(), errors, "password confirmation", "Поле не должно быть пустым");
        validator.shorterThan(form.getPassword(), 255, errors, "password", "Поле должно быть короче, чем 255 символов");
        validator.longerThan(form.getPassword(), 6, errors, "password", "Поле должно быть длинее, чем 6 символов");

        validator.isNotNullOrEmpty(form.getName(), errors, "name", "Поле не должно быть пустым");
        validator.shorterThan(form.getName(), 255, errors, "name", "Поле должно быть короче, чем 255 символов");

        validator.isNotNullOrEmpty(form.getPhone(), errors, "phone", "Поле не должно быть пустым");
        validator.shorterThan(form.getPhone(), 19, errors, "phone", "Поле должно быть короче, чем 19 символов");
        validator.longerThan(form.getPhone(), 5, errors, "phone", "Поле должно быть длинее, чем 5 символа");

        validator.isNotNullOrEmpty(form.getAddress(), errors, "address", "Поле не должно быть пустым");
        validator.shorterThan(form.getAddress(), 255, errors, "address", "Поле должно быть, короче чем 255 символов");

        if (form.getPublicEmail().length() != 0) {
            validator.isEmail(form.getPublicEmail(), errors, "publicEmail", "Введите правильный email");
        }

        validator.shorterThan(form.getWebsite(), 255, errors, "website", "Поле должно быть, короче чем 255 символов");

//        if (!form.getPassword().equals(form.getPasswordConfirmation())) {
//            errors.put("password", "Пароли должны совпадать");
//        }

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
