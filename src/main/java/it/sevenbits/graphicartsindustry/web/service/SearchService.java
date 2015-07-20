package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.SearchRepository;
import it.sevenbits.graphicartsindustry.web.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private SearchRepository repository;

    public List<PolygraphyMinModel> findAll(int limit) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findAll(limit);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddres(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query) throws ServiceException {
        try {
            List<Polygraphy> polygraphies = repository.findPolygraphies(query);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (Polygraphy p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddres(), p.getPhone()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<ServiceModel> findFrequentServices(int limit) throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.Service> services = repository.findFrequentServices(limit);
            List<ServiceModel> models = new ArrayList<>(services.size());
            for (it.sevenbits.graphicartsindustry.core.domain.Service s: services) {
                models.add(new ServiceModel(s.getId(), s.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<PaymentMethodModel> findPaymentMethods() throws ServiceException {
        try {
            List<PaymentMethod> paymentMethods = repository.findPaymentMethods();
            List<PaymentMethodModel> models = new ArrayList<>(paymentMethods.size());
            for (PaymentMethod p: paymentMethods) {
                models.add(new PaymentMethodModel(p.getId(), p.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public List<DeliveryMethodModel> findDeliveryMethods() throws ServiceException {
        try {
            List<DeliveryMethod> deliveryMethods = repository.findDeliveryMethods();
            List<DeliveryMethodModel> models = new ArrayList<>(deliveryMethods.size());
            for (DeliveryMethod d: deliveryMethods) {
                models.add(new DeliveryMethodModel(d.getId(), d.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
