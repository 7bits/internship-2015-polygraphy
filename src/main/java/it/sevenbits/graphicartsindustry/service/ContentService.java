package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.content.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.content.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.repository.ContentRepository;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.utils.SearchPolygraphyResolver;
import it.sevenbits.graphicartsindustry.web.view.content.DeliveryMethodModel;
import it.sevenbits.graphicartsindustry.web.view.content.PaymentMethodModel;
import it.sevenbits.graphicartsindustry.web.view.content.ServiceModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    private static Logger LOG = Logger.getLogger(ContentService.class);

    @Autowired
    private MessageByLocaleService messageByLocaleService;


    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private SearchPolygraphyResolver searchPolygraphyResolver;

    public List<ServiceModel> findAllServices() throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.content.Service> services =
                    contentRepository.findAllServices();
            List<ServiceModel> models = null;
            if (services != null) {
                models = new ArrayList<>(services.size());
                for (it.sevenbits.graphicartsindustry.core.domain.content.Service s : services) {
                    models.add(new ServiceModel(s.getId(), s.getName()));
                }
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.content.services"));
        }
    }

    public List<ServiceModel> findFrequentServices() throws ServiceException {
        try {
            List<it.sevenbits.graphicartsindustry.core.domain.content.Service> services =
                    contentRepository.findFrequentServices(searchPolygraphyResolver.getLimitServices());
            List<ServiceModel> models = null;
            if (services != null) {
                models = new ArrayList<>(services.size());
                for (it.sevenbits.graphicartsindustry.core.domain.content.Service s : services) {
                    models.add(new ServiceModel(s.getId(), s.getName()));
                }
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.content.services"));
        }
    }

    public List<PaymentMethodModel> findPaymentMethods() throws ServiceException {
        try {
            List<PaymentMethod> paymentMethods = contentRepository.findAllPaymentMethods();
            List<PaymentMethodModel> models = null;
            if (paymentMethods != null) {
                models = new ArrayList<>(paymentMethods.size());
                for (PaymentMethod p : paymentMethods) {
                    models.add(new PaymentMethodModel(p.getId(), p.getName()));
                }
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.content.payment_methods"));
        }
    }

    public List<DeliveryMethodModel> findDeliveryMethods() throws ServiceException {
        try {
            List<DeliveryMethod> deliveryMethods = contentRepository.findAllDeliveryMethods();
            List<DeliveryMethodModel> models = null;
            if (deliveryMethods != null) {
                models = new ArrayList<>(deliveryMethods.size());
                for (DeliveryMethod d : deliveryMethods) {
                    models.add(new DeliveryMethodModel(d.getId(), d.getName()));
                }
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.content.delivery_methods"));
        }
    }
}
