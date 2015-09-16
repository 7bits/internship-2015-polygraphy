package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.domain.polygraphy.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.forms.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    public List<PolygraphyMinModel> findAllAllowedPolygraphy(int limit) throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findAllDisplayPolygraphies(limit);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving all polygraphies: " + e.getMessage(), e);
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
            throw new ServiceException("An error occurred while retrieving polygraphies " +
                    "satisfy the query: " + e.getMessage(), e);
        }
    }

    public PolygraphyFullModel findPolygraphy(int id) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findDisplayPolygraphy(id);
            PolygraphyFullModel models = new PolygraphyFullModel(polygraphyContacts.getId(), polygraphyContacts.getName(),
                    polygraphyContacts.getAddress(), polygraphyContacts.getPhone(), polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(),
                    polygraphyContacts.getInfo());
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving full information " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }
}
