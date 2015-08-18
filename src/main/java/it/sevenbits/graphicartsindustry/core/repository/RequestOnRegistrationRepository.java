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

    public void saveRequestOnRegistration(String email) throws RepositoryException {
        try {
            requestOnRegistrationMapper.saveRequestOnRegistration(email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving email request on registration "
                    + e.getMessage(), e);
        }
    }

    public void saveHash(String hash, int id) throws RepositoryException {
        try {
            requestOnRegistrationMapper.saveHash(hash, id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving hash registration link: "
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

    public RequestOnRegistration findRequestById(int requestId) throws RepositoryException {
        try {
            return requestOnRegistrationMapper.findRequestById(requestId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving hash registration link: "
                    + e.getMessage(), e);
        }
    }

    public RequestOnRegistration findRequestByEmail (String email) throws RepositoryException {
        try {
            return requestOnRegistrationMapper.findRequestByEmail(email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while finding email in request", e);
        }
    }

    public RequestOnRegistration findRequestByHash(String hash) throws RepositoryException {
        try {
            return requestOnRegistrationMapper.findRequestByHash(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving hash registration link: "
                    + e.getMessage(), e);
        }
    }

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
}
