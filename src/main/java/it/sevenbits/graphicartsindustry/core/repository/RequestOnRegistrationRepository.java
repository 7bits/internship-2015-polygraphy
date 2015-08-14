package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.mappers.RequestOnRegistrationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "requestOnRegistrationRepository")
public class RequestOnRegistrationRepository {

    @Autowired
    private RequestOnRegistrationMapper requestOnRegistrationMapper;

    public void removeRequestOnRegistration(int requestId) throws RepositoryException {
        try {
            requestOnRegistrationMapper.removeRequestOnRegistrationById(requestId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing request on registration: "
                    + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistration(String hash) throws RepositoryException {
        try {
            requestOnRegistrationMapper.removeRequestOnRegistrationByHash(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing request on registration: "
                    + e.getMessage(), e);
        }
    }

    public List<RequestOnRegistration> findAllRequestsOnRegistration() throws RepositoryException {
        try {
            return requestOnRegistrationMapper.findAllRequestsOnRegistration();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all requests on registration "
                    + e.getMessage(), e);
        }
    }
}
