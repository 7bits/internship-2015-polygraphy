package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.repository.*;
import it.sevenbits.graphicartsindustry.web.domain.admin.PolygraphyAdminModel;
import it.sevenbits.graphicartsindustry.web.domain.request.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.utils.UrlResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    @Autowired
    private UrlResolver urlResolver;

    public void removeRequestOnRegistration(int requestId) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationById(requestId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing request on registration ");
        }
    }

    public void removePolygraphy(int polygraphyId) throws ServiceException {
        try {
            polygraphyServicesRepository.removePolygraphyPaymentMethods(polygraphyId);
            polygraphyServicesRepository.removePolygraphyDeliveryMethods(polygraphyId);
            polygraphyServicesRepository.removePolygraphyServices(polygraphyId);

            polygraphyContactRepository.removePolygraphyContacts(polygraphyId);

            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);

            polygraphyRepository.deletePolygraphy(polygraphyId);

            if (userId != null)
                userRepository.deleteUser(userId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing polygraphy ");
        }
    }

    public List<PolygraphyAdminModel> showAllPolygraphy() throws ServiceException {
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

    public List<RequestOnRegistrationModel> showAllRequests() throws ServiceException {
        try {
            List<RequestOnRegistration> requestsOnRegistration =
                    requestOnRegistrationRepository.findAllRequestsOnRegistration();
            List<RequestOnRegistrationModel> models = new ArrayList<>(requestsOnRegistration.size());
            for (RequestOnRegistration r: requestsOnRegistration) {
                models.add(new RequestOnRegistrationModel(r.getId(), r.getEmail(), r.getHash(),
                        "http://" + urlResolver.getDomain() + "/registration?id=" + r.getHash()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while showing all requests on registration " +
                    e.getMessage(),e);
        }
    }

    public void changeConditionDisplayPolygraphy (int polygraphyId, boolean curCondition) throws ServiceException {
        try {
            polygraphyRepository.changeConditionDisplayPolygraphy(polygraphyId, !curCondition);
        } catch (Exception e) {
            throw new  ServiceException("An error occurred while changing condition polygraphy " +
                    e.getMessage(),e);
        }
    }
}
