package it.sevenbits.graphicartsindustry.web.service.registration;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.RegistrationRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.web.domain.content.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RegistrationRepository registrationRepository;

    public PolygraphyFullModel saveAll (RegistrationFirstForm firstForm, RegistrationSecondForm secondForm)
            throws ServiceException {
        try {
            User user = userRepository.createUser(firstForm.getEmail(), firstForm.getPassword(),
                    Role.ROLE_POLYGRAPHY);

            Polygraphy polygraphy = registrationRepository.createPolygraphy(firstForm.getName(), firstForm.getAddress(),
                    firstForm.getPhone(), firstForm.getPublicEmail(), firstForm.getOrderByEmail(),
                    firstForm.getWebsite(), firstForm.getInfo(), secondForm.getPaymentMethods(),
                    secondForm.getWritesTheCheck(), secondForm.getDeliveryMethods(),
                    secondForm.getServices(), user.getId());

            PolygraphyFullModel models = new PolygraphyFullModel(polygraphy.getId(), polygraphy.getName(),
                    polygraphy.getAddress(), polygraphy.getPhone(), polygraphy.getEmail(), polygraphy.getWebsite(),
                    polygraphy.getInfo());

            return models;
        } catch (Exception e) {
        throw new ServiceException("An error occurred while saving registration form polygraphy "
                + e.getMessage(), e);
        }
    }

    public void deleteAll (int polygraphyId) throws ServiceException {
        try {
            registrationRepository.deletePolygraphy(polygraphyId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting polygraphy "
                    + e.getMessage(), e);
        }
        return;
    }
}
