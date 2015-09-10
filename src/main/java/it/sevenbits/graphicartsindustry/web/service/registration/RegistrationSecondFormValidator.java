package it.sevenbits.graphicartsindustry.web.service.registration;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.service.CommonFieldValidator;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegistrationSecondFormValidator {

    private static final Logger LOG = Logger.getLogger(RegistrationSecondFormValidator.class);

    @Autowired
    private CommonFieldValidator validator;

    public HashMap<String, String> validate(final RegistrationSecondForm form) throws ServiceException {
        try {
            //LOG.info("SubscriptionFormValidator started for: " + form.toString());
            HashMap<String, String> errors = new HashMap<>();

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
        } catch (Exception e) {
            throw new ServiceException("An error occurred when checking the validity of the data. ");
        }
    }
}
