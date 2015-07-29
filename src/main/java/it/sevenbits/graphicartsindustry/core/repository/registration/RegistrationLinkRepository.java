package it.sevenbits.graphicartsindustry.core.repository.registration;

import it.sevenbits.graphicartsindustry.core.domain.RegistrationLink;
import it.sevenbits.graphicartsindustry.core.mappers.RegistrationLinkMapper;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "registrationLinkRepositoryC")
public class RegistrationLinkRepository {

    private static Logger LOG = Logger.getLogger(RegistrationLinkRepository.class);

    @Autowired
    private RegistrationLinkMapper mapper;

    public void save(String link) throws RepositoryException {
        try {
            mapper.save(link);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public void delete(String link) throws RepositoryException {
        try {
            mapper.delete(link);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }

    public RegistrationLink find(String link) throws RepositoryException {
        try {
            RegistrationLink l = mapper.find(link);
            return mapper.find(link);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving subscriptions: " + e.getMessage(), e);
        }
    }
}
