package it.sevenbits.graphicartsindustry.core.repository;

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
            if (!query.getQuery().isEmpty() && query.getServiceId()==0 && !query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByName(query.getQuery());
            if (query.getQuery().isEmpty() && query.getServiceId()!=0 && !query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByService(query.getServiceId());
            if (!query.getQuery().isEmpty() && query.getServiceId()!=0 && !query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndService(query.getQuery(), query.getServiceId());

            if (query.getQuery().isEmpty() && query.getServiceId()==0 && query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByCheck();
            if (!query.getQuery().isEmpty() && query.getServiceId()==0 && query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndCheck(query.getQuery());
            if (query.getQuery().isEmpty() && query.getServiceId()!=0 &&  query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByServiceAndCheck(query.getServiceId());
            if (!query.getQuery().isEmpty() && query.getServiceId()!=0 && query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndServiceAndCheck(query.getQuery(), query.getServiceId());

            if (query.getQuery().isEmpty() && query.getServiceId()==0 && !query.getWritesTheCheck() &&
                    query.getOrderByEmail())
                return mapper.findPolygraphiesByOrder();
            if (!query.getQuery().isEmpty() && query.getServiceId()==0 && !query.getWritesTheCheck() &&
                    query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndOrder(query.getQuery());
            if (query.getQuery().isEmpty() && query.getServiceId()!=0 &&  !query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByServiceAndOrder(query.getServiceId());
            if (query.getQuery().isEmpty() && query.getServiceId()==0 && query.getWritesTheCheck() &&
                    query.getOrderByEmail())
                return mapper.findPolygraphiesByCheckAndOrder();
            if (!query.getQuery().isEmpty() && query.getServiceId()!=0 && !query.getWritesTheCheck() &&
                    query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndServiceAndOrder(query.getQuery(), query.getServiceId());
            if (!query.getQuery().isEmpty() && query.getServiceId()==0 && query.getWritesTheCheck() &&
                    query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndCheckAndOrder(query.getQuery());
            if (query.getQuery().isEmpty() && query.getServiceId()!=0 &&  query.getWritesTheCheck() &&
                    !query.getOrderByEmail())
                return mapper.findPolygraphiesByServiceAndCheckAndOrder(query.getServiceId());
            if (!query.getQuery().isEmpty() && query.getServiceId()!=0 && query.getWritesTheCheck() &&
                    query.getOrderByEmail())
                return mapper.findPolygraphiesByNameAndServiceAndCheckAndOrder(query.getQuery(), query.getServiceId());




            return findAll(3);
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

    public Polygraphy findPolygraphy(int id) throws RepositoryException {
        try {
            return mapper.findPolygraphy(id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
