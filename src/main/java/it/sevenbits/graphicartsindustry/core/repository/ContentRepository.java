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
            throw new RepositoryException("An error occurred while retrieving all services "
                    + e.getMessage(), e);
        }
    }

    public List<Service> findFrequentServices(Integer limit) throws RepositoryException {
        if (limit == null) {
            throw new RepositoryException("Limit is null");
        }
        try {
            return mapper.findFrequentServices(limit);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving frequent services "
                    + e.getMessage(), e);
        }
    }

    public List<PaymentMethod> findAllPaymentMethods() throws RepositoryException {
        try {
            return mapper.findAllPaymentMethods();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving payment methods "
                    + e.getMessage(), e);
        }
    }

    public List<DeliveryMethod> findAllDeliveryMethods() throws RepositoryException {
        try {
            return mapper.findAllDeliveryMethods();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving delivery methods "
                    + e.getMessage(), e);
        }
    }
}
