package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.mappers.RequestOnRegistrationMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "requestOnRegistrationRepository")
public class RequestOnRegistrationRepository {

    private static Logger LOG = Logger.getLogger(RequestOnRegistrationRepository.class);

    @Autowired
    private RequestOnRegistrationMapper requestOnRegistrationMapper;

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
            throw new RepositoryException("An error occurred while retrieving request by id "
                    + e.getMessage(), e);
        }
    }

    public RequestOnRegistration findRequestByEmail (String email) throws RepositoryException {
        if (email == null) {
            throw new RepositoryException("Email is null");
        }
        try {
            return requestOnRegistrationMapper.findRequestByEmail(email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving request by email", e);
        }
    }

    public RequestOnRegistration findRequestByHash(String hash) throws RepositoryException {
        if (hash == null) {
            throw new RepositoryException("Hash is null");
        }
        try {
            return requestOnRegistrationMapper.findRequestByHash(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving request by hash registration link "
                    + e.getMessage(), e);
        }
    }

    public void saveRequestOnRegistration(String email) throws RepositoryException {
        if (email == null) {
            throw new RepositoryException("Email is null");
        }
        try {
            requestOnRegistrationMapper.insertRequestOnRegistration(email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving request on registration "
                    + e.getMessage(), e);
        }
    }

    public void saveHash(String hash, int id) throws RepositoryException {
        if (hash == null) {
            throw new RepositoryException("Hash is null");
        }
        try {
            requestOnRegistrationMapper.updateHash(hash, id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving hash registration link in request "
                    + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistrationById(int requestId) throws RepositoryException {
        try {
            requestOnRegistrationMapper.removeRequestOnRegistrationById(requestId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing request on registration by id "
                    + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistrationByHash(String hash) throws RepositoryException {
        if (hash == null) {
            throw new RepositoryException("Hash is null");
        }
        try {
            requestOnRegistrationMapper.removeRequestOnRegistrationByHash(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing request on registration by hash "
                    + e.getMessage(), e);
        }
    }
}
