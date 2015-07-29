package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.RegistrationLink;
import it.sevenbits.graphicartsindustry.core.repository.registration.RegistrationLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationLinkService {
    private String linkBasic = "http://localhost:9000";
    private String linkRegistration = "/registration-link?id=";
    private int min = 100000;
    private int max = 999999;

    @Autowired
    private RegistrationLinkRepository repository;

    public RegistrationLink generateRegistrationLink() throws ServiceException {
        int number = min + (int)(Math.random() * ((max - min) + 1));
        String hash = Integer.toString(number);

        RegistrationLink link = new RegistrationLink(linkBasic, linkRegistration, hash);
        return link;
    }

    public void saveRegistrationLink(RegistrationLink link) throws ServiceException {
        try {
            repository.save(link.getHash());
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving link: " + e.getMessage(), e);
        }
    }

    public void deleteRegistrationLink(RegistrationLink link) throws ServiceException {
        try {
            repository.delete(link.getHash());
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting link: " + e.getMessage(), e);
        }
    }

    public boolean findRegistrationLink(String link) throws ServiceException {
        try {
            RegistrationLink t = repository.find(link);
            if (t==null)
                return false;
            else
                return true;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting link: " + e.getMessage(), e);
        }
    }
}
