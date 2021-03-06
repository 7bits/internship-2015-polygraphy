package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import it.sevenbits.graphicartsindustry.core.mappers.SearchMapper;
import it.sevenbits.graphicartsindustry.web.domain.SearchForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "polygraphyRepository")
public class PolygraphyRepository implements SearchRepository{

    private static Logger LOG = Logger.getLogger(PolygraphyRepository.class);

    @Autowired
    private SearchMapper mapper;

    public List<Polygraphy> findAll(int limit) throws RepositoryException {
        try {
            return mapper.findAll(limit);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<Polygraphy> findPolygraphies(SearchForm query) throws RepositoryException {
        try {
            String symbolIsBanned = "'";
            String processedQuery = query.getQuery().replaceAll(symbolIsBanned,"");
            return mapper.findPolygraphies(processedQuery.toLowerCase(), query.getServiceId(), query.getPaymentMethod(),
                    query.getWritesTheCheck(), query.getDeliveryMethod(), query.getOrderByEmail());
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

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

    public Polygraphy findPolygraphy(int id) throws RepositoryException {
        try {
            return mapper.findPolygraphy(id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
