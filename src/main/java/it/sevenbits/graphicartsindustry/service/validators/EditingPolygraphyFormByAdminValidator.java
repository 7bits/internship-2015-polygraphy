package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EditingPolygraphyFormByAdminValidator {

    @Autowired
    private CommonFieldValidator validator;

    private static final Logger LOG = Logger.getLogger(EditingPolygraphyFormByAdminValidator.class);

    public HashMap<String, String> validate(final EditingPolygraphyForm form) throws RepositoryException {
        LOG.info("SubscriptionFormValidator started for: " + form.toString());
        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getName(), errors, "name", "Поле не должно быть пустым");
        validator.isNotNullOrEmpty(form.getPhone(), errors, "phone", "Поле не должно быть пустым");
        validator.isNotNullOrEmpty(form.getAddress(), errors, "address", "Поле не должно быть пустым");

        if (form.getPublicEmail().length() != 0) {
            validator.isEmail(form.getPublicEmail(), errors, "publicEmail", "Введите правильный email");
        }

        validator.shorterThan(form.getName(), 255, errors, "name", "Поле должно быть короче, чем 255 символов");
        validator.shorterThan(form.getPhone(), 19, errors, "phone", "Поле должно быть короче, чем 19 символов");
        validator.shorterThan(form.getAddress(), 255, errors, "address", "Поле должно быть, короче чем 255 символов");
        validator.shorterThan(form.getWebsite(), 255, errors, "website", "Поле должно быть, короче чем 255 символов");

        validator.longerThan(form.getPhone(), 5, errors, "phone", "Поле должно быть длиннее, чем 5 символа");

        validator.isRegistrated(form.getEmail(), errors, "email", "Такой email уже зарегистрирован");

        validator.isNotNullListId(form.getServices(), errors, "services", "Необходимо выбрать хотя бы одну услугу");
        validator.isNotNullListId(form.getDeliveryMethods(), errors, "deliveryMethods", "Необходимо выбрать хотя бы " +
                "один метод доставки");
        validator.isNotNullListId(form.getPaymentMethods(), errors, "paymentMethods", "Необходимо выбрать хотя бы " +
                "один метод оплаты");

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}

