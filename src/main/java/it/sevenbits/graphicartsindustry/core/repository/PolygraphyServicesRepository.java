package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyServicesMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "polygraphyServicesRepository")
public class PolygraphyServicesRepository {

    private static Logger LOG = Logger.getLogger(PolygraphyServicesRepository.class);

    @Autowired
    private PolygraphyServicesMapper polygraphyServicesMapper;

    public List<Integer> findPolygraphyPaymentMethods(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not load polygraphy-payment methods due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyServicesMapper.findPolygraphyPaymentMethods(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not load polygraphy-payment methods due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving polygraphy payment methods " +
                    e.getMessage(), e);
        }
    }

    public List<Integer> findPolygraphyDeliveryMethods(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not load polygraphy-delivery methods due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyServicesMapper.findPolygraphyDeliveryMethods(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not load polygraphy-delivery methods due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving polygraphy delivery methods " +
                    e.getMessage(), e);
        }
    }

    public List<Integer> findPolygraphyServices(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not load polygraphy-services due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            return polygraphyServicesMapper.findPolygraphyServices(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not load polygraphy-services due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving polygraphy services " +
                    e.getMessage(), e);
        }
    }

    public void createPolygraphyPaymentMethod(Integer polygraphyId, Integer paymentMethodId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not create polygraphy-payment method due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        if (paymentMethodId == null) {
            LOG.error("Can not create polygraphy-payment method due to repository error: payment method id is null");
            throw new RepositoryException("Payment method ID is null");
        }
        try {
            polygraphyServicesMapper.insertPolygraphyPaymentMethod(polygraphyId, paymentMethodId);
        } catch (Exception e) {
            LOG.error("Can not create polygraphy-payment method due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating polygraphy payment method "
                    + e.getMessage(), e);
        }
    }

    public void createPolygraphyDeliveryMethod(Integer polygraphyId, Integer deliveryMethodId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not create polygraphy-delivery method due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        if (deliveryMethodId == null) {
            LOG.error("Can not create polygraphy-delivery method due to repository error: delivery method id is null");
            throw new RepositoryException("Delivery method ID is null");
        }
        try {
            polygraphyServicesMapper.insertPolygraphyDeliveryMethod(polygraphyId, deliveryMethodId);
        } catch (Exception e) {
            LOG.error("Can not create polygraphy-delivery method due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating polygraphy delivery method "
                    + e.getMessage(), e);
        }
    }

    public void createPolygraphyService(Integer polygraphyId, Integer serviceId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not create polygraphy-service due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        if (serviceId == null) {
            LOG.error("Can not create polygraphy-service due to repository error: service id is null");
            throw new RepositoryException("Service ID is null");
        }
        try {
           polygraphyServicesMapper.insertPolygraphyService(polygraphyId, serviceId);
        } catch (Exception e) {
            LOG.error("Can not create polygraphy-service due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating polygraphy service "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphyPaymentMethods(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not remove polygraphy-payment methods due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyServicesMapper.deletePolygraphyPaymentMethods(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not remove polygraphy-payment methods due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing polygraphy payment methods "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphyDeliveryMethods(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not remove polygraphy-delivery methods due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyServicesMapper.deletePolygraphyDeliveryMethods(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not remove polygraphy-delivery methods due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing polygraphy delivery methods "
                    + e.getMessage(), e);
        }
    }

    public void removePolygraphyServices(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not remove polygraphy-services due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyServicesMapper.deletePolygraphyServices(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not remove polygraphy-services due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing polygraphy services "
                    + e.getMessage(), e);
        }
    }
}
