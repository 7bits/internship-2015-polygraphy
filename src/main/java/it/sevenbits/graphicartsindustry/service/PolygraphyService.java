package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyContactRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyServicesRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyAdminModel;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.forms.SearchForm;
import it.sevenbits.graphicartsindustry.web.utils.SearchPolygraphyResolver;
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

    @Autowired
    private SearchPolygraphyResolver searchPolygraphyResolver;

    public List<PolygraphyAdminModel> findAllPolygraphies() throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findAllPolygraphies();
            List<PolygraphyAdminModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyAdminModel(p.getId(), p.getName(), p.getEmail(), p.isDisplayed()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find all polygraphies. ");
        }
    }

    public List<PolygraphyMinModel> findAllDisplayPolygraphies() throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies =
                    polygraphyRepository.findAllDisplayPolygraphies(searchPolygraphyResolver.getLimitPolygraphies());
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find all display polygraphies. ");
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query) throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findPolygraphies(query);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find polygraphies. ");
        }
    }

    public PolygraphyFullModel findPolygraphy(int id) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findDisplayPolygraphy(id);
            PolygraphyFullModel models = new PolygraphyFullModel(polygraphyContacts.getId(), polygraphyContacts.getName(),
                    polygraphyContacts.getAddress(), polygraphyContacts.getPhone(), polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(),
                    polygraphyContacts.getInfo());
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find all polygraphy. ");
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
            throw new ServiceException("Can not remove all polygraphies. ");
        }
    }
}
