package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.search.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.web.domain.search.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.domain.search.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.domain.search.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolygraphyService {

    @Autowired
    private PolygraphyRepository repository;

    public List<PolygraphyMinModel> findAll(int limit) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findAll(limit);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddres(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving all polygraphies: " + e.getMessage(), e);
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findPolygraphies(query);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddres(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving polygraphies " +
                    "satisfy the query: " + e.getMessage(), e);
        }
    }

    public PolygraphyFullModel findPolygraphy(int id) throws ServiceException {
        try {
            Polygraphy polygraphy = repository.findPolygraphy(id);
            PolygraphyFullModel models = new PolygraphyFullModel(polygraphy.getId(), polygraphy.getName(),
                    polygraphy.getAddres(), polygraphy.getEmail(), polygraphy.getWebsite(),polygraphy.getPhone());
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving full information " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }
}
