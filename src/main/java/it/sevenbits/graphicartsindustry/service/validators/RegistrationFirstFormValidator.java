package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
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
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final RegistrationFirstForm form) throws ServiceException {

        LOG.info("RegistrationFirstFormValidator started for: " + form.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.registration_first_form_validator.email.not_empty"));
        validator.shorterThan(form.getEmail(), 255, errors, "email",
                messageByLocaleService.getMessage("error.registration_first_form_validator.email.not_long"));
        validator.isEmail(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.registration_first_form_validator.email.valid"));
        validatorService.isRegistrated(form.getEmail(), errors, "email",
                messageByLocaleService.getMessage("error.registration_first_form_validator.email.is_registrated"));

        validator.isNotNullOrEmpty(form.getPassword(), errors, "password",
                messageByLocaleService.getMessage("error.registration_first_form_validator.password.not_empty"));
//        validator.isNotNullOrEmpty(form.getPasswordConfirmation(), errors, "password confirmation", "Поле не должно быть пустым");
        validator.shorterThan(form.getPassword(), 255, errors, "password",
                messageByLocaleService.getMessage("error.registration_first_form_validator.password.not_long"));
        validator.longerThan(form.getPassword(), 6, errors, "password",
                messageByLocaleService.getMessage("error.registration_first_form_validator.password.least"));

        validator.isNotNullOrEmpty(form.getName(), errors, "name",
                messageByLocaleService.getMessage("error.registration_first_form_validator.name.not_empty"));
        validator.shorterThan(form.getName(), 255, errors, "name",
                messageByLocaleService.getMessage("error.registration_first_form_validator.name.not_long"));

        validator.isNotNullOrEmpty(form.getPhone(), errors, "phone",
                messageByLocaleService.getMessage("error.registration_first_form_validator.phone.not_empty"));
        validator.shorterThan(form.getPhone(), 19, errors, "phone",
                messageByLocaleService.getMessage("error.registration_first_form_validator.phone.not_long"));
        validator.longerThan(form.getPhone(), 5, errors, "phone",
                messageByLocaleService.getMessage("error.registration_first_form_validator.phone.least"));

        validator.isNotNullOrEmpty(form.getAddress(), errors, "address",
                messageByLocaleService.getMessage("error.registration_first_form_validator.address.not_empty"));
        validator.shorterThan(form.getAddress(), 255, errors, "address",
                messageByLocaleService.getMessage("error.registration_first_form_validator.address.not_long"));

        if (form.getPublicEmail().length() != 0) {
            validator.isEmail(form.getPublicEmail(), errors, "publicEmail",
                    messageByLocaleService.getMessage("error.registration_first_form_validator.public_email.valid"));
        }

        validator.shorterThan(form.getWebsite(), 255, errors, "website",
                messageByLocaleService.getMessage("error.registration_first_form_validator.website.not_long"));

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
