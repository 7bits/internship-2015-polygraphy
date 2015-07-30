package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.repository.registration.RegistrationRepository;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repository;

    public void saveAll (RegistrationForm form) throws ServiceException {
        try {
            repository.saveAll(form.getName(), form.getWritesTheCheck(), form.getOrderByEmail(),
                    form.getAddress(), form.getEmailPublic(), form.getWebsite(), form.getPhone(),
                    form.getPaymentMethods(), form.getDeliveryMethods(), form.getServices());
        } catch (Exception e) {
        throw new ServiceException("An error occurred while saving registration form polygraphy "
                + e.getMessage(), e);
        }
    }

    public void deleteAll (int polygraphyId) throws ServiceException {
        try {
            repository.deleteAll(polygraphyId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting polygraphy "
                    + e.getMessage(), e);
        }
    }
}
