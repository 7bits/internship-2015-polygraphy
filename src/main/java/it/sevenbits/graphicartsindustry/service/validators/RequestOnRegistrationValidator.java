package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestOnRegistrationValidator {

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    private static final Logger LOG = Logger.getLogger(RequestOnRegistrationValidator.class);

    public HashMap<String, String> validate(final RequestOnRegistrationForm form) throws ServiceException {
        LOG.info("SubscriptionFormValidator started for: " + form.toString());
        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getEmail(), errors, "email", "Поле не должно быть пустым");

        validator.isEmail(form.getEmail(), errors, "email", "Введите правильный email");

        validator.shorterThan(form.getEmail(), 255, errors, "email", "Поле должно быть кроче чем 255 символов");

        validatorService.isRegistrated(form.getEmail(), errors, "email", "Такой email уже зарегистрирован");
        validatorService.isRequested(form.getEmail(), errors, "email", "С этого email уже подана заявка. Введите другой email или свяжитесь с администратором anastasia.lyubich@gmail.com");
        
        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}

