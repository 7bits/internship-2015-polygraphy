package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
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

    public List<PolygraphyContacts> findPolygraphies(SearchForm query) throws RepositoryException {
        try {
            String symbolIsBanned = "'";
            String processedQuery = query.getQuery().replaceAll(symbolIsBanned,"");
            return polygraphyMapper.findPolygraphies(processedQuery.toLowerCase(), query.getServices(), query.getPaymentMethod(),
                    query.isWritesTheCheck(), query.getDeliveryMethod(), query.isOrderByEmail());
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphies " +
                    "satisfy the query " + e.getMessage(), e);
        }
    }

    public List<PolygraphyContacts> findAllPolygraphies() throws RepositoryException {
        try {
            return polygraphyMapper.findAllPolygraphies();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all polygraphies " +
                    e.getMessage(), e);
        }
    }

    public List<PolygraphyContacts> findAllPolygraphiesDisplayed(Integer limit) throws RepositoryException {
        if (limit == null) {
            throw new RepositoryException("Limit is null");
        }
        try {
            return polygraphyMapper.findAllPolygraphiesDisplayed(limit);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all displayed polygraphies " +
                    e.getMessage(), e);
        }
    }

    public PolygraphyContacts findPolygraphy(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.findPolygraphy(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving full information " +
                    "about polygraphy " + e.getMessage(), e);
        }
    }

    public PolygraphyContacts findPolygraphyDisplayed(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.findPolygraphyDisplayed(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving full information " +
                    "about displayed polygraphy " + e.getMessage(), e);
        }
    }

    public Integer getPolygraphyIdByUserId(Integer userId) throws RepositoryException {
        if (userId == null) {
            throw new RepositoryException("User ID is null");
        }
        try {
            return polygraphyMapper.getPolygraphyIdByUserId(userId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while getting polygraphy id by user id " +
                    e.getMessage(), e);
        }
    }

    public Integer getUserIdByPolygraphyId(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.getUserIdByPolygraphyId(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while getting user id by polygraphy id " +
                    e.getMessage(), e);
        }
    }

    public void createPolygraphy(Polygraphy polygraphy) throws RepositoryException {
        if (polygraphy == null) {
            throw new RepositoryException("Polygraphy is null");
        }
        try {
            polygraphyMapper.createPolygraphy(polygraphy);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while creating polygraphy " +
                    e.getMessage(), e);
        }
    }

    public Boolean isWritesTheCheck(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.isWritesTheCheck(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving condition 'writes the check' of " +
                    "polygraphy " + e.getMessage(), e);
        }
    }

    public Boolean isOrderByEmail(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyMapper.isOrderByEmail(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving condition 'order by email' of " +
                    "polygraphy " + e.getMessage(), e);
        }
    }

    public void editPolygraphyInfo(Integer polygraphyId, String info) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyInfo(polygraphyId, info);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing polygraphy info " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyWritesTheCheck(Integer polygraphyId, Boolean writesTheCheck) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyWritesTheCheck(polygraphyId, writesTheCheck);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing condition 'writes the check' of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyOrderByEmail(Integer polygraphyId, Boolean orderByEmail) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyOrderByEmail(polygraphyId, orderByEmail);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing condition 'order by email' of polygraphy" +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyName(Integer polygraphyId, String name) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updatePolygraphyName(polygraphyId, name);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing polygraphy name " +
                    e.getMessage(), e);
        }
    }

    public void editConditionDisplayPolygraphy(Integer polygraphyId, Boolean condition) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.updateConditionDisplayPolygraphy(polygraphyId, condition);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing condition polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void deletePolygraphy(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyMapper.deletePolygraphy(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing polygraphy " +
                    e.getMessage(), e);
        }
    }
}
