package it.sevenbits.graphicartsindustry.web.service.registration;

import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationLink;
import it.sevenbits.graphicartsindustry.core.repository.RegistrationLinkRepository;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationLinkService {
    private String linkBasic = "http://polygraphy.7bits.it";
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
            throw new ServiceException("An error occurred while saving hash registration link: "
                    + e.getMessage(), e);
        }
    }

    public void deleteRegistrationLink(RegistrationLink link) throws ServiceException {
        try {
            repository.delete(link.getHash());
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting hash registration link: "
                    + e.getMessage(), e);
        }
    }

    public boolean findRegistrationLink(String link) throws ServiceException {
        try {
            String hash = repository.find(link);
            if (hash==null)
                return false;
            else
                return true;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving hash registration link: "
                    + e.getMessage(), e);
        }
    }
}
