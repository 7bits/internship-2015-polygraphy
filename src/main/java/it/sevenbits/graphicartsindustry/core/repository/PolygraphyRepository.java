package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyMapper;
import it.sevenbits.graphicartsindustry.web.forms.SearchForm;
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

    public List<PolygraphyContacts> findPolygraphies(SearchForm query) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphies(query.getQuery().toLowerCase(), query.getServices(), query.getPaymentMethod(),
                    query.isWritesTheCheck(), query.getDeliveryMethod(), query.isOrderByEmail());
        } catch (Exception e) {
            LOG.error("Can not load polygraphies by query due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving polygraphies " +
                    "satisfy the query " + e.getMessage(), e);
        }
    }

    public List<PolygraphyContacts> findAllPolygraphies() throws RepositoryException {
        try {
            return polygraphyMapper.findAllPolygraphies();
        } catch (Exception e) {
            LOG.error("Can not load all polygraphies due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving all polygraphies " +
                    e.getMessage(), e);
        }
    }

    public List<PolygraphyContacts> findAllDisplayPolygraphies(Integer limit) throws RepositoryException {
        if (limit == null) {
            LOG.error("Can not load all display polygraphies constrained 'limit' due to repository error: limit is null");
            throw new RepositoryException("Limit is null");
        }
        try {
            return polygraphyMapper.findAllDisplayPolygraphies(limit);
        } catch (Exception e) {
            LOG.error("Can not load all display polygraphies due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving all displayed polygraphies " +
                    e.getMessage(), e);
        }
    }

    public PolygraphyContacts findPolygraphy(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not load polygraphy due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.findPolygraphy(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not load polygraphy due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving full information " +
                    "about polygraphy " + e.getMessage(), e);
        }
    }

    public PolygraphyContacts findDisplayPolygraphy(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not load display polygraphy due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.findDisplayPolygraphy(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not load display polygraphy due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving full information " +
                    "about displayed polygraphy " + e.getMessage(), e);
        }
    }

    public Integer getPolygraphyIdByUserId(Integer userId) throws RepositoryException {
        if (userId == null) {
            LOG.error("Can not get polygraphy id by user id due to repository error: user id is null");
            throw new RepositoryException("User ID is null");
        }
        try {
            return polygraphyMapper.getPolygraphyIdByUserId(userId);
        } catch (Exception e) {
            LOG.error("Can not get polygraphy id by user id due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while getting polygraphy id by user id " +
                    e.getMessage(), e);
        }
    }

    public Integer getUserIdByPolygraphyId(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not get user id by polygraphy id due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.getUserIdByPolygraphyId(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not get user id by polygraphy id due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while getting user id by polygraphy id " +
                    e.getMessage(), e);
        }
    }

    public void createPolygraphy(Polygraphy polygraphy) throws RepositoryException {
        if (polygraphy == null) {
            LOG.error("Can not create polygraphy due to repository error: polygraphy is null");
            throw new RepositoryException("Polygraphy is null");
        }
        try {
            polygraphyMapper.createPolygraphy(polygraphy);
        } catch (Exception e) {
            LOG.error("Can not create polygraphy due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating polygraphy " +
                    e.getMessage(), e);
        }
    }

    public Boolean isWritesTheCheck(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not get 'writes the check' due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.isWritesTheCheck(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not get 'writes the check' due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving condition 'writes the check' of " +
                    "polygraphy " + e.getMessage(), e);
        }
    }

    public Boolean isOrderByEmail(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not get 'order by email' due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.isOrderByEmail(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not get 'order by email' due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving condition 'order by email' of " +
                    "polygraphy " + e.getMessage(), e);
        }
    }

    public void editPolygraphyInfo(Integer polygraphyId, String info) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit polygraphy info due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyInfo(polygraphyId, info);
        } catch (Exception e) {
            LOG.error("Can not edit polygraphy info due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing polygraphy info " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyWritesTheCheck(Integer polygraphyId, Boolean writesTheCheck) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit 'writes the check' due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyWritesTheCheck(polygraphyId, writesTheCheck);
        } catch (Exception e) {
            LOG.error("Can not edit 'writes the check' due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing condition 'writes the check' of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyOrderByEmail(Integer polygraphyId, Boolean orderByEmail) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit 'order by email' due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyOrderByEmail(polygraphyId, orderByEmail);
        } catch (Exception e) {
            LOG.error("Can not edit 'order by email' due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing condition 'order by email' of polygraphy" +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyName(Integer polygraphyId, String name) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit polygraphy name due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyName(polygraphyId, name);
        } catch (Exception e) {
            LOG.error("Can not edit polygraphy name due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing polygraphy name " +
                    e.getMessage(), e);
        }
    }

    public void editConditionDisplayPolygraphy(Integer polygraphyId, Boolean curCondition) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit condition display polygraphy due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        if (curCondition == null) {
            LOG.error("Can not edit condition display polygraphy due to repository error: current condition is null");
            throw new RepositoryException("Current condition is null");
        }
        try {
            polygraphyMapper.updateConditionDisplayPolygraphy(polygraphyId, curCondition);
        } catch (Exception e) {
            LOG.error("Can not edit condition display polygraphy due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing condition polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void removePolygraphy(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not remove polygraphy due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.deletePolygraphy(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not remove polygraphy due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing polygraphy " +
                    e.getMessage(), e);
        }
    }
}
