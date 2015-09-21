package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestOnRegistrationValidator {

    @Autowired
    private CommonFieldValidator validator;

    private static final Logger LOG = Logger.getLogger(RequestOnRegistrationValidator.class);

    public HashMap<String, String> validate(final RequestOnRegistrationForm form) throws RepositoryException, ServiceException {
        LOG.info("SubscriptionFormValidator started for: " + form.toString());
        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getEmail(), errors, "email", "Поле не должно быть пустым");

        validator.isEmail(form.getEmail(), errors, "email", "Введите правильный email");

        validator.shorterThan(form.getEmail(), 255, errors, "email", "Поле должно быть кроче чем 255 символов");

        validator.isRegistrated(form.getEmail(), errors, "email", "Такой email уже зарегистрирован");

        validator.isRequested(form.getEmail(), errors, "email", "С этого email уже подана заявка. Введите другой email или свяжитесь с администратором anastasia.lyubich@gmail.com");


        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
