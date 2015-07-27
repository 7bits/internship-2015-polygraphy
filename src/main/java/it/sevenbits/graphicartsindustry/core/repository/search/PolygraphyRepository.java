package it.sevenbits.graphicartsindustry.core.repository.search;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.web.domain.search.SearchForm;

import java.util.List;

public interface PolygraphyRepository {
    List<Polygraphy> findAll(int limit) throws RepositoryException;
    List<Polygraphy> findPolygraphies(SearchForm query) throws RepositoryException;
    Polygraphy findPolygraphy(int id) throws RepositoryException;
}
