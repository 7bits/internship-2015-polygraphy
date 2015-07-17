package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.SearchRepository;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyFullModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagePolygraphyService {
    @Autowired
    private SearchRepository repository;

    public PolygraphyFullModel showPolygraphy(int id) throws ServiceException {
        try {
            Polygraphy polygraphy = repository.findPolygraphy(id);
            PolygraphyFullModel models = new PolygraphyFullModel(polygraphy.getId(), polygraphy.getName(),
                    polygraphy.getAddres(), polygraphy.getEmail(), polygraphy.getWebsite(),polygraphy.getPhone());
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}