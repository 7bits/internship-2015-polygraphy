package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditingPolygraphyService {

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private UserRepository userRepository;

    public PolygraphyForm showFullInfoAboutPolygraphy(int polygraphyId) throws RepositoryException, ServiceException {
        try {
            User user = userRepository.findByPolygraphyId(polygraphyId);
            Polygraphy polygraphy = polygraphyRepository.findPolygraphy(polygraphyId);

            PolygraphyForm polygraphyForm = new PolygraphyForm(polygraphyId, user.getUsername(), null,
                    polygraphy.getName(), polygraphy.getAddress(), polygraphy.getPhone(), polygraphy.getEmail(),
                    polygraphy.getWebsite(), polygraphy.getInfo(),
                    polygraphyRepository.isOrderByEmail(polygraphyId),
                    polygraphyRepository.findPolygraphyPaymentMethods(polygraphyId),
                    polygraphyRepository.isWritesTheCheck(polygraphyId),
                    polygraphyRepository.findPolygraphyDeliveryMethods(polygraphyId),
                    polygraphyRepository.findPolygraphyServices(polygraphyId));
            return polygraphyForm;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving full information " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }

    public void saveEditing(PolygraphyForm form, int polygrahyId) throws ServiceException {
        try {
            polygraphyRepository.saveEditingPolygraphy(form.getPolygraphyId(), form.getEmail(), form.getPassword(),
                    form.getName(), form.getAddress(), form.getPhone(), form.getPublicEmail(), form.getWebsite(),
                    form.getInfo(), form.getOrderByEmail(), form.getPaymentMethods(), form.getWritesTheCheck(),
                    form.getDeliveryMethods(), form.getServices());
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving editing information about polygraphy " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }
}
