package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import it.sevenbits.graphicartsindustry.web.domain.admin.PolygraphyAdminModel;
import it.sevenbits.graphicartsindustry.web.domain.registration.RequestOnRegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    public void removeRequestOnRegistration(int requestId) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistration(requestId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing request on registration ");
        }
    }

    public List<PolygraphyAdminModel> showAllPolygraphy() throws ServiceException {
        try {
            List<Polygraphy> polygraphies = polygraphyRepository.findAllPolygraphies();
            List<PolygraphyAdminModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
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
                models.add(new RequestOnRegistrationModel(r.getId(), r.getEmail(), r.getHash()));
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
