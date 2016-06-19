package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.content.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.content.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.content.Service;
import it.sevenbits.graphicartsindustry.core.mappers.ContentMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "contentRepository")
public class ContentRepository {

    private static Logger LOG = Logger.getLogger(ContentRepository.class);

    @Autowired
    private ContentMapper mapper;

    public List<Service> findAllServices() throws RepositoryException {
        try {
            return mapper.findAllServices();
        } catch (Exception e) {
            LOG.error("Can not load all services due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving all services "
                    + e.getMessage(), e);
        }
    }

    public List<Service> findFrequentServices(Integer limit) throws RepositoryException {
        if (limit == null) {
            LOG.error("Can not load frequent services constrained 'limit' due to repository error: limit is null");
            throw new RepositoryException("Limit is null");
        }
        try {
            return mapper.findFrequentServices(limit);
        } catch (Exception e) {
            LOG.error("Can not load frequent services due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving frequent services "
                    + e.getMessage(), e);
        }
    }

    public List<Service> findServiceByName(String query) throws RepositoryException {
        try {
            return mapper.findServicesByName(query);
        } catch (Exception e) {
            LOG.error("Can not load all services due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving services by name"
                    + e.getMessage(), e);
        }
    }

    public void incrementServiceRating(Integer serviceId) throws RepositoryException {
        if (serviceId == null) {
            LOG.error("Can not increment rating service due to repository error: service id is null");
            throw new RepositoryException("Service ID is null");
        }
        try {
            mapper.incrementServiceRating(serviceId);
        } catch (Exception e) {
            LOG.error("Can not load all services due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while increment service rating "
                    + e.getMessage(), e);
        }
    }

    public List<PaymentMethod> findAllPaymentMethods() throws RepositoryException {
        try {
            return mapper.findAllPaymentMethods();
        } catch (Exception e) {
            LOG.error("Can not load all payment methods due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving payment methods "
                    + e.getMessage(), e);
        }
    }

    public List<DeliveryMethod> findAllDeliveryMethods() throws RepositoryException {
        try {
            return mapper.findAllDeliveryMethods();
        } catch (Exception e) {
            LOG.error("Can not load all delivery methods due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving delivery methods "
                    + e.getMessage(), e);
        }
    }
}
