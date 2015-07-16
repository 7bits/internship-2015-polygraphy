package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.SearchRepository;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyMinModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {
    @Autowired
    private SearchRepository repository;

    public PolygraphyMinModel showPolygraphy(int id) throws ServiceException {
        try {
            Polygraphy polygraphy = repository.findPolygraphy(id);
            PolygraphyMinModel models = new PolygraphyMinModel(polygraphy.getId(), polygraphy.getName());
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}