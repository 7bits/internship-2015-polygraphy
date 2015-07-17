package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.SearchRepository;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.domain.SearchForm;
import it.sevenbits.graphicartsindustry.web.domain.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private SearchRepository repository;

    public List<PolygraphyMinModel> findAll(int limit) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findAll(limit);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddres(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query, int limit) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findPolygraphies(query.getQuery(), limit);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddres(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<ServiceModel> findFrequentServices(int limit) throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.Service> services = repository.findFrequentServices(limit);
            List<ServiceModel> models = new ArrayList<>(services.size());
            for (it.sevenbits.graphicartsindustry.core.domain.Service s: services) {
                models.add(new ServiceModel(s.getId(), s.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
