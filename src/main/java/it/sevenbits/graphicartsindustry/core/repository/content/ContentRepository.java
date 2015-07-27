package it.sevenbits.graphicartsindustry.core.repository.content;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;

import java.util.List;

public interface ContentRepository {
    List<Service> findFrequentServices(int limit) throws RepositoryException;
    List<PaymentMethod> findPaymentMethods() throws RepositoryException;
    List<DeliveryMethod> findDeliveryMethods() throws RepositoryException;
}
