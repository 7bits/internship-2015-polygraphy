package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import it.sevenbits.graphicartsindustry.web.domain.SearchForm;

import java.util.List;

public interface SearchRepository {
    List<Polygraphy> findAll(int limit) throws RepositoryException;
    List<Polygraphy> findPolygraphies(SearchForm query) throws RepositoryException;
    List<Service> findFrequentServices(int limit) throws RepositoryException;
    List<PaymentMethod> findPaymentMethods() throws RepositoryException;
    List<DeliveryMethod> findDeliveryMethods() throws RepositoryException;
    Polygraphy findPolygraphy(int id) throws RepositoryException;
}
