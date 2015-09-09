package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.web.domain.search.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.domain.search.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    public List<PolygraphyMinModel> findAllPolygraphiesDisplayed(int limit) throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findAllPolygraphiesDisplayed(limit);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Polygraphies has not been found");
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query) throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findPolygraphies(query);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Polygraphies has not been found");
        }
    }
}
