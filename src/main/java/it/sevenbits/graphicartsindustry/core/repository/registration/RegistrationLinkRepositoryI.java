package it.sevenbits.graphicartsindustry.core.repository.registration;

import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;

public interface RegistrationLinkRepositoryI {
    void delete(String link) throws RepositoryException;
    void save(String link) throws RepositoryException;
}
