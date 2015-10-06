package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
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
    private MessageByLocaleService messageByLocaleService;

    @Autowired
    private CommonFieldValidator validator;

    @Autowired
    private ValidatorService validatorService;

    public HashMap<String, String> validate(final EditingPolygraphyForm polygraphyForm) throws ServiceException {

        LOG.info("EditingPolygraphyValidator started for: " + polygraphyForm.toString());

        HashMap<String, String> errors = new HashMap<>();

        validator.isNotNullOrEmpty(polygraphyForm.getName(), errors, "name",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.name.not_empty"));
        validator.shorterThan(polygraphyForm.getName(), 255, errors, "name",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.name.not_long"));

        validator.isNotNullOrEmpty(polygraphyForm.getPhone(), errors, "phone",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.phone.not_empty"));
        validator.shorterThan(polygraphyForm.getPhone(), 19, errors, "phone",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.phone.not_long"));
        validator.longerThan(polygraphyForm.getPhone(), 5, errors, "phone",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.phone.least"));

        validator.isNotNullOrEmpty(polygraphyForm.getAddress(), errors, "address",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.address.not_empty"));
        validator.shorterThan(polygraphyForm.getAddress(), 255, errors, "address",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.address.not_long"));

        if (polygraphyForm.getPublicEmail().length() != 0) {
            validator.isEmail(polygraphyForm.getPublicEmail(), errors, "publicEmail",
                    messageByLocaleService.getMessage("error.editing_polygraphy_validator.public_email.valid"));
        }

        validator.shorterThan(polygraphyForm.getWebsite(), 255, errors, "website",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.website.not_long"));


        validator.isNotNullListId(polygraphyForm.getServices(), errors, "services",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.services.not_empty"));

        validator.isNotNullListId(polygraphyForm.getPaymentMethods(), errors, "paymentMethods",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.payment_methods.not_empty"));

        validator.isNotNullListId(polygraphyForm.getDeliveryMethods(), errors, "deliveryMethods",
                messageByLocaleService.getMessage("error.editing_polygraphy_validator.delivery_methods.not_empty"));

        for (Map.Entry<String, String> entry : errors.entrySet()) {
            LOG.info(String.format("Error found: Filed=%s, Error=%s",
                    entry.getKey(), entry.getValue()));
        }
        return errors;
    }
}
