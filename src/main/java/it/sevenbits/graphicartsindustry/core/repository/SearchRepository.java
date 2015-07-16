package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;

import java.util.List;

public interface SearchRepository {
    List<Polygraphy> findAll(int limit) throws RepositoryException;
    List<Polygraphy> findPolygraphies(String query) throws RepositoryException;
    Polygraphy findPolygraphy(int id) throws RepositoryException;
}
