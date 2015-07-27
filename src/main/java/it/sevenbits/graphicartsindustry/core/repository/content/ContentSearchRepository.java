package it.sevenbits.graphicartsindustry.core.repository.content;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import it.sevenbits.graphicartsindustry.core.mappers.ContentMapper;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "contentRepository")
public class ContentSearchRepository implements ContentRepository{
    private static Logger LOG = Logger.getLogger(ContentSearchRepository.class);

    @Autowired
    private ContentMapper mapper;

    public List<Service> findFrequentServices(int limit) throws RepositoryException {
        try {
            return mapper.findFrequentServices(limit);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<PaymentMethod> findPaymentMethods() throws RepositoryException {
        try {
            return mapper.findPaymentMethods();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<DeliveryMethod> findDeliveryMethods() throws RepositoryException {
        try {
            return mapper.findDeliveryMethods();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
