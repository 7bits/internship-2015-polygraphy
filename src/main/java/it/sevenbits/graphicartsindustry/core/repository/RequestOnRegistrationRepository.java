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
            LOG.error("Can not load all requests on registration due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving all requests on registration "
                    + e.getMessage(), e);
        }
    }

    public RequestOnRegistration findRequestById(Integer requestId) throws RepositoryException {
        if (requestId == null) {
            LOG.error("Can not load request on registration due to repository error: request id is null");
            throw new RepositoryException("Request on registration ID is null");
        }
        try {
            return requestOnRegistrationMapper.findRequestById(requestId);
        } catch (Exception e) {
            LOG.error("Can not load requests on registration by id due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving request on registration by id "
                    + e.getMessage(), e);
        }
    }

    public RequestOnRegistration findRequestByEmail (String email) throws RepositoryException {
        if (email == null) {
            LOG.error("Can not load request on registration due to repository error: request email is null");
            throw new RepositoryException("Request on registartion email is null");
        }
        try {
            return requestOnRegistrationMapper.findRequestByEmail(email);
        } catch (Exception e) {
            LOG.error("Can not load requests on registration by email due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving request on registration by email" +
                    e.getMessage(), e);
        }
    }

    public RequestOnRegistration findRequestByHash(String hash) throws RepositoryException {
        if (hash == null) {
            LOG.error("Can not load request on registration due to repository error: request hash is null");
            throw new RepositoryException("Request on registration hash is null");
        }
        try {
            return requestOnRegistrationMapper.findRequestByHash(hash);
        } catch (Exception e) {
            LOG.error("Can not load requests on registration by hash due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving request on registration by hash " +
                    "registration link " + e.getMessage(), e);
        }
    }

    public void createRequestOnRegistration(String email) throws RepositoryException {
        if (email == null) {
            LOG.error("Can not create request on registration due to repository error: request email is null");
            throw new RepositoryException("Request on registration email is null");
        }
        try {
            requestOnRegistrationMapper.insertRequestOnRegistration(email);
        } catch (Exception e) {
            LOG.error("Can not create requests on registration due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating request on registration "
                    + e.getMessage(), e);
        }
    }

    public void editHash(Integer requestId, String hash) throws RepositoryException {
        if (requestId == null) {
            LOG.error("Can not edit hash registration link in request on registration due to repository error: " +
                    "request id is null");
            throw new RepositoryException("Request on registration ID is null");
        }
        try {
            requestOnRegistrationMapper.updateHash(requestId, hash);
        } catch (Exception e) {
            LOG.error("Can not edit hash registration link in requests on registration due to repository error: " +
                    e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing hash registration link in request on " +
                    "registration " + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistrationById(Integer requestId) throws RepositoryException {
        if (requestId == null) {
            LOG.error("Can not remove request on registration by id due to repository error: request id is null");
            throw new RepositoryException("Request on registration ID is null");
        }
        try {
            requestOnRegistrationMapper.removeRequestOnRegistrationById(requestId);
        } catch (Exception e) {
            LOG.error("Can not remove requests on registration by id due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing request on registration by id "
                    + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistrationByHash(String hash) throws RepositoryException {
        if (hash == null) {
            LOG.error("Can not remove request on registration by hash due to repository error: request hash is null");
            throw new RepositoryException("Request on registration hash is null");
        }
        try {
            requestOnRegistrationMapper.removeRequestOnRegistrationByHash(hash);
        } catch (Exception e) {
            LOG.error("Can not remove requests on registration by hash due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing request on registration by hash "
                    + e.getMessage(), e);
        }
    }
}
