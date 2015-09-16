package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyContactRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyServicesRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyAdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolygraphyService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;


    public List<PolygraphyAdminModel> findAllPolygraphies() throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findAllPolygraphies();
            List<PolygraphyAdminModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyAdminModel(p.getId(), p.getName(), p.getEmail(), p.isDisplayed()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while showing all polygraphies " +
                    e.getMessage(),e);
        }
    }

    public void removePolygraphy(int polygraphyId) throws ServiceException {
        try {
            polygraphyServicesRepository.removePolygraphyPaymentMethods(polygraphyId);
            polygraphyServicesRepository.removePolygraphyDeliveryMethods(polygraphyId);
            polygraphyServicesRepository.removePolygraphyServices(polygraphyId);

            polygraphyContactRepository.removePolygraphyContacts(polygraphyId);

            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);

            polygraphyRepository.removePolygraphy(polygraphyId);

            if (userId != null)
                userRepository.removeUser(userId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing polygraphy ");
        }
    }


}
