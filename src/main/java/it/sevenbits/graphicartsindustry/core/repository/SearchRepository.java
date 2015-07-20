package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import it.sevenbits.graphicartsindustry.web.domain.SearchForm;

import java.util.List;

public interface SearchRepository {
    List<Polygraphy> findAll(int limit) throws RepositoryException;
    List<Polygraphy> findPolygraphies(SearchForm query) throws RepositoryException;
    List<Service> findFrequentServices(int limit) throws RepositoryException;
    Polygraphy findPolygraphy(int id) throws RepositoryException;
}
