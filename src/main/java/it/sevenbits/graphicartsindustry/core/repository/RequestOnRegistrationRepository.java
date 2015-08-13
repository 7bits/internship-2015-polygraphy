package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.mappers.RequestOnRegistrationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "requestOnRegistrationRepository")
public class RequestOnRegistrationRepository {

    @Autowired
    private RequestOnRegistrationMapper requestOnRegistrationMapper;

    public void removeRequestOnRegistration(int requestId) throws RepositoryException {
        try {
            requestOnRegistrationMapper.removeRequestOnRegistration(requestId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing request on registration: "
                    + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistration(String hash) throws RepositoryException {
        try {
            requestOnRegistrationMapper.removeRequestOnRegistration(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing request on registration: "
                    + e.getMessage(), e);
        }
    }
}
