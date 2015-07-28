package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.repository.registration.RegistrationLinkRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationLinkService {
    @Autowired
    private RegistrationLinkRepositoryI repository;

    public void saveRegistrationLink(String link) throws ServiceException {
        try {
            repository.save(link);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving link: " + e.getMessage(), e);
        }
    }

    public void deleteRegistrationLink(String link) throws ServiceException {
        try {
            repository.delete(link);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting link: " + e.getMessage(), e);
        }
    }
}
