package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyServicesMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "polygraphyServicesRepository")
public class PolygraphyServicesRepository {

    private static Logger LOG = Logger.getLogger(PolygraphyServicesRepository.class);

    @Autowired
    private PolygraphyServicesMapper polygraphyServicesMapper;

    public void createPolygraphyPaymentMethod(int polygraphyId, int paymentMethodId) throws RepositoryException {
        try {
            polygraphyServicesMapper.insertPolygraphyPaymentMethod(polygraphyId, paymentMethodId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while creating polygraphy payment method "
                    + e.getMessage(), e);
        }
    }

    public void createPolygraphyDeliveryMethod(int polygraphyId, int deliveryMethodId) throws RepositoryException {
        try {
            polygraphyServicesMapper.insertPolygraphyDeliveryMethod(polygraphyId, deliveryMethodId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while creating polygraphy delivery method "
                    + e.getMessage(), e);
        }
    }

    public void createPolygraphyService(int polygraphyId, int serviceId) throws RepositoryException {
        try {
           polygraphyServicesMapper.insertPolygraphyService(polygraphyId, serviceId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while creating polygraphy service "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphyPaymentMethods(int polygraphyId) throws RepositoryException {
        try {
            polygraphyServicesMapper.deletePolygraphyPaymentMethods(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing polygraphy payment methods "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphyDeliveryMethods(int polygraphyId) throws RepositoryException {
        try {
            polygraphyServicesMapper.deletePolygraphyDeliveryMethods(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing polygraphy delivery methods "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphyServices(int polygraphyId) throws RepositoryException {
        try {
            polygraphyServicesMapper.deletePolygraphyServices(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing polygraphy services "
                    + e.getMessage(), e);
        }
    }
}
