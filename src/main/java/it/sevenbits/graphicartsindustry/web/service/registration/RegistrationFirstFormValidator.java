package it.sevenbits.graphicartsindustry.web.service.registration;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.service.CommonFieldValidator;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegistrationFirstFormValidator {

    @Autowired
    private CommonFieldValidator validator;

    private static final Logger LOG = Logger.getLogger(RegistrationFirstFormValidator.class);

    public HashMap<String, String> validate(final RegistrationFirstForm form) throws ServiceException {
        LOG.info("SubscriptionFormValidator started for: " + form.toString());
        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getEmail(), errors, "email", "Поле не должно быть пустым");
        validator.isNotNullOrEmpty(form.getPassword(), errors, "password", "Поле не должно быть пустым");
        //validator.isNotNullOrEmpty(form.getPasswordConfirmation(), errors, "password confirmation", "Поле не должно быть пустым");
        validator.isNotNullOrEmpty(form.getName(), errors, "name", "Поле не должно быть пустым");
        validator.isNotNullOrEmpty(form.getPhone(), errors, "phone", "Поле не должно быть пустым");
        validator.isNotNullOrEmpty(form.getAddress(), errors, "address", "Поле не должно быть пустым");

        validator.isEmail(form.getEmail(), errors, "email", "Введите правильный email");
        validator.isEmail(form.getPublicEmail(), errors, "publicEmail", "Введите правильный email");

        validator.shorterThan(form.getEmail(), 255, errors, "email", "Поле должно быть кроче чем 255 символов");
        validator.shorterThan(form.getPassword(), 255, errors, "password", "Поле должно быть кроче чем 255 символов");
        validator.shorterThan(form.getName(), 255, errors, "name", "Поле должно быть кроче чем 255 символов");
        validator.shorterThan(form.getAddress(), 255, errors, "address", "Поле должно быть кроче чем 255 символов");
        validator.shorterThan(form.getPhone(), 15, errors, "phone", "Поле должно быть кроче чем 15 символов");

        validator.longerThan(form.getPassword(), 5, errors, "password", "Поле должно быть длинее чем 5 символов");

        validator.isRegistrated(form.getEmail(), errors, "email", "Такой email уже зарегистрирован");
        //validator.shorterThan(form.getPasswordConfirmation(), 255, errors, "password confirmation", "Поле должно быть кроче чем 255 символов");

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
