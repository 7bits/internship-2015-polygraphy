package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyMapper;
import it.sevenbits.graphicartsindustry.web.domain.search.SearchForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "polygraphyRepository")
public class PolygraphyRepository {

    private static Logger LOG = Logger.getLogger(PolygraphyRepository.class);

    @Autowired
    private PolygraphyMapper polygraphyMapper;

    public List<Polygraphy> findPolygraphies(SearchForm query) throws RepositoryException {
        try {
            String symbolIsBanned = "'";
            String processedQuery = query.getQuery().replaceAll(symbolIsBanned,"");
            return polygraphyMapper.findPolygraphies(processedQuery.toLowerCase(), query.getServices(), query.getPaymentMethod(),
                    query.isWritesTheCheck(), query.getDeliveryMethod(), query.isOrderByEmail());
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphies " +
                    "satisfy the query: " + e.getMessage(), e);
        }
    }

    public List<Polygraphy> findAll(int limit) throws RepositoryException {
        try {
            return polygraphyMapper.findAll(limit);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all polygraphies: " + e.getMessage(), e);
        }
    }

    public List<Polygraphy> findAllPolygraphies() throws RepositoryException {
        try {
            return polygraphyMapper.findAllPolygraphy();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all polygraphies "
                    + e.getMessage(), e);
        }
    }

    public Polygraphy findPolygraphy(int id) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphy(id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving full information " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }

}
