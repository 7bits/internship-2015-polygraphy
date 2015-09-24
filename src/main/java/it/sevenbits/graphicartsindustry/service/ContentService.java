package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.content.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.content.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.repository.ContentRepository;
import it.sevenbits.graphicartsindustry.web.view.content.DeliveryMethodModel;
import it.sevenbits.graphicartsindustry.web.view.content.PaymentMethodModel;
import it.sevenbits.graphicartsindustry.web.view.content.ServiceModel;
import it.sevenbits.graphicartsindustry.web.utils.SearchPolygraphyResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private SearchPolygraphyResolver searchPolygraphyResolver;

    public List<ServiceModel> findAllServices() throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.content.Service> services = contentRepository.findAllServices();
            List<ServiceModel> models = new ArrayList<>(services.size());
            for (it.sevenbits.graphicartsindustry.core.domain.content.Service s: services) {
                models.add(new ServiceModel(s.getId(), s.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find polygraphy services. ");
        }
    }

    public List<ServiceModel> findFrequentServices() throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.content.Service> services =
                    contentRepository.findFrequentServices(searchPolygraphyResolver.getLimitServices());
            List<ServiceModel> models = new ArrayList<>(services.size());
            for (it.sevenbits.graphicartsindustry.core.domain.content.Service s: services) {
                models.add(new ServiceModel(s.getId(), s.getName()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find polygraphy services. ");
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
            throw new ServiceException("Can not find polygraphy payment method. ");
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
            throw new ServiceException("Can not find polygraphy delivery method. ");
        }
    }
}
