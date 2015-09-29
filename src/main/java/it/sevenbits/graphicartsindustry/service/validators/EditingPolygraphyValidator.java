package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.ServiceException;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EditingPolygraphyValidator {

    private static final Logger LOG = Logger.getLogger(EditingPolygraphyValidator.class);

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final EditingPolygraphyForm polygraphyForm) throws ServiceException {

        LOG.info("SubscriptionFormValidator started for: " + polygraphyForm.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(polygraphyForm.getName(), errors, "name", "Поле не должно быть пустым");
        validator.shorterThan(polygraphyForm.getName(), 255, errors, "name", "Поле должно быть короче, чем 255 символов");

        validator.isNotNullOrEmpty(polygraphyForm.getPhone(), errors, "phone", "Поле не должно быть пустым");
        validator.shorterThan(polygraphyForm.getPhone(), 19, errors, "phone", "Поле должно быть короче, чем 19 символов");
        validator.longerThan(polygraphyForm.getPhone(), 5, errors, "phone", "Поле должно быть длиннее, чем 5 символа");

        validator.isNotNullOrEmpty(polygraphyForm.getAddress(), errors, "address", "Поле не должно быть пустым");
        validator.shorterThan(polygraphyForm.getAddress(), 255, errors, "address", "Поле должно быть, короче чем 255 символов");

        if (polygraphyForm.getPublicEmail().length() != 0) {
            validator.isEmail(polygraphyForm.getPublicEmail(), errors, "publicEmail", "Введите правильный email");
        }

        validator.shorterThan(polygraphyForm.getWebsite(), 255, errors, "website", "Поле должно быть, короче чем 255 символов");


        validator.isNotNullListId(polygraphyForm.getServices(), errors, "services", "Необходимо выбрать хотя бы одну услугу");

        validator.isNotNullListId(polygraphyForm.getDeliveryMethods(), errors, "deliveryMethods", "Необходимо выбрать хотя бы " +
                "один метод доставки");

        validator.isNotNullListId(polygraphyForm.getPaymentMethods(), errors, "paymentMethods", "Необходимо выбрать хотя бы " +
                "один метод оплаты");

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
