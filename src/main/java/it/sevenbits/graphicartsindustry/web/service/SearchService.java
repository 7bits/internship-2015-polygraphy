package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.SearchRepository;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private SearchRepository repository;

    public List<PolygraphyModel> findAll(int limit) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findAll(limit);
            List<PolygraphyModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyModel(p.getId(), p.getName()));
            }

            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
