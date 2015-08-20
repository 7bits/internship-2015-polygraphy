package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyMapper;
import it.sevenbits.graphicartsindustry.core.mappers.UserMapper;
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

    @Autowired
    private UserMapper userMapper;

    public List<Polygraphy> findPolygraphies(SearchForm query) throws RepositoryException {
        try {
            String symbolIsBanned = "'";
            String processedQuery = query.getQuery().replaceAll(symbolIsBanned,"");
            return polygraphyMapper.findPolygraphies(processedQuery.toLowerCase(), query.getServices(), query.getPaymentMethod(),
                    query.isWritesTheCheck(), query.getDeliveryMethod(), query.isOrderByEmail());
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphies " +
                    "satisfy the query: " + e.getMessage(), e);
        }
    }

    public List<Polygraphy> findAll(int limit) throws RepositoryException {
        try {
            return polygraphyMapper.findAll(limit);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all polygraphies: " + e.getMessage(), e);
        }
    }

    public List<Polygraphy> findAllPolygraphies() throws RepositoryException {
        try {
            return polygraphyMapper.findAllPolygraphy();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving all polygraphies "
                    + e.getMessage(), e);
        }
    }

    public Polygraphy findPolygraphy(int id) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphy(id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving full information " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }

    public String findPolygraphyEmailById(int id) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphy(id).getEmail();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy email " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }

    public Integer getPolygraphyIdByUserId(int userId) throws RepositoryException {
        try {
            return polygraphyMapper.getPolygraphyIdByUserId(userId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy email " +
                    "about polygraphy: " + e.getMessage(), e);
        }
    }

    public void changeConditionDisplayPolygraphy(int polygraphyId, boolean condition) throws RepositoryException {
        try {
            polygraphyMapper.updateConditionDisplayPolygraphy(polygraphyId, condition);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while changing condition polygraphy " +
                    e.getMessage(), e);
        }
    }

    public boolean isWritesTheCheck(int polygraphyId) throws RepositoryException {
        try {
            return polygraphyMapper.isWritesTheCheck(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy (isWritesTheCheck) " +
                    e.getMessage(), e);
        }
    }

    public boolean isOrderByEmail(int polygraphyId) throws RepositoryException {
        try {
            return polygraphyMapper.isOrderByEmail(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy (isOrderByEmail) " +
                    e.getMessage(), e);
        }
    }

    public List<Integer> findPolygraphyPaymentMethods(int polygraphyId) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphyPaymentMethods(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy payment methods " +
                    e.getMessage(), e);
        }
    }

    public List<Integer> findPolygraphyDeliveryMethods(int polygraphyId) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphyDeliveryMethods(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy delivery methods " +
                    e.getMessage(), e);
        }
    }

    public List<Integer> findPolygraphyServices(int polygraphyId) throws RepositoryException {
        try {
            return polygraphyMapper.findPolygraphyServices(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy services " +
                    e.getMessage(), e);
        }
    }

    public void saveEditingPolygraphy(int polygraphyId, String name, String address, String phone,
                                      String publicEmail, String website, String info,
                                      Boolean orderByEmail, List<Integer> paymentMethods,
                                      Boolean writesTheCheck, List<Integer> deliveryMethods,
                                      List<Integer> services) throws RepositoryException {
        try {
            polygraphyMapper.updatePolygraphyName(polygraphyId, name);
            polygraphyMapper.updateContactAddress(polygraphyId, address);
            polygraphyMapper.updateContactPhone(polygraphyId, phone);
            polygraphyMapper.updateContactEmail(polygraphyId, publicEmail);
            polygraphyMapper.updateContactWebsite(polygraphyId, website);
            polygraphyMapper.updatePolygraphyInfo(polygraphyId, info);
            polygraphyMapper.updatePolygraphyOrderByEmail(polygraphyId, orderByEmail);

            polygraphyMapper.deletePolygraphyPaymentMethods(polygraphyId);
            for (Integer p: paymentMethods) {
                polygraphyMapper.insertPaymentMethod(polygraphyId, p);
            }

            polygraphyMapper.updatePolygraphyWritesTheCheck(polygraphyId, writesTheCheck);

            polygraphyMapper.deletePolygraphyDeliveryMethods(polygraphyId);
            for (Integer d: deliveryMethods) {
                polygraphyMapper.insertDeliveryMethod(polygraphyId, d);
            }

            polygraphyMapper.deletePolygraphyServices(polygraphyId);
            for (Integer s: services) {
                polygraphyMapper.insertService(polygraphyId, s);
            }
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving editing information about polygraphy "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphy(int polygraphyId) throws RepositoryException {
        try {
            polygraphyMapper.deletePolygraphyServices(polygraphyId);
            polygraphyMapper.deletePolygraphyDeliveryMethods(polygraphyId);
            polygraphyMapper.deletePolygraphyPaymentMethods(polygraphyId);
            polygraphyMapper.deletePolygraphyContacts(polygraphyId);
            Integer userId = polygraphyMapper.getUserId(polygraphyId);
            polygraphyMapper.deletePolygraphyBasic(polygraphyId);
            if (userId!=null)
                userMapper.deleteUser(userId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing polygraphy "
                    + e.getMessage(), e);
        }
    }
}
