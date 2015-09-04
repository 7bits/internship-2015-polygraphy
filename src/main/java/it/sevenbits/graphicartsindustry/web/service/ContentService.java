package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.ContentRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.web.domain.content.DeliveryMethodModel;
import it.sevenbits.graphicartsindustry.web.domain.content.PaymentMethodModel;
import it.sevenbits.graphicartsindustry.web.domain.content.ServiceModel;
import it.sevenbits.graphicartsindustry.web.domain.content.PolygraphyFullModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    public List<ServiceModel> findAllServices() throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.Service> services = contentRepository.findAllServices();
            List<ServiceModel> models = new ArrayList<>(services.size());
            for (it.sevenbits.graphicartsindustry.core.domain.Service s: services) {
                models.add(new ServiceModel(s.getId(), s.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving all services: "
                    + e.getMessage(), e);
        }
    }

    public List<ServiceModel> findFrequentServices(int limit) throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.Service> services = contentRepository.findFrequentServices(limit);
            List<ServiceModel> models = new ArrayList<>(services.size());
            for (it.sevenbits.graphicartsindustry.core.domain.Service s: services) {
                models.add(new ServiceModel(s.getId(), s.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving frequent services: "
                    + e.getMessage(), e);
        }
    }

    public List<PaymentMethodModel> findPaymentMethods() throws ServiceException {
        try {
            List<PaymentMethod> paymentMethods = contentRepository.findAllPaymentMethods();
            List<PaymentMethodModel> models = new ArrayList<>(paymentMethods.size());
            for (PaymentMethod p: paymentMethods) {
                models.add(new PaymentMethodModel(p.getId(), p.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving payment methods: "
                    + e.getMessage(), e);
        }
    }

    public List<DeliveryMethodModel> findDeliveryMethods() throws ServiceException {
        try {
            List<DeliveryMethod> deliveryMethods = contentRepository.findAllDeliveryMethods();
            List<DeliveryMethodModel> models = new ArrayList<>(deliveryMethods.size());
            for (DeliveryMethod d: deliveryMethods) {
                models.add(new DeliveryMethodModel(d.getId(), d.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving delivery methods: "
                    + e.getMessage(), e);
        }
    }

    public PolygraphyFullModel findPolygraphy(int id) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphyDisplayed(id);
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
