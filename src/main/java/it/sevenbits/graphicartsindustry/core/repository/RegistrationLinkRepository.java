package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.mappers.RegistrationLinkMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "registrationLinkRepository")
public class RegistrationLinkRepository {

    private static Logger LOG = Logger.getLogger(RegistrationLinkRepository.class);

    @Autowired
    private RegistrationLinkMapper mapper;

//    public void save(String hash) throws RepositoryException {
//        try {
//            mapper.save(hash);
//        } catch (Exception e) {
//            throw new RepositoryException("An error occurred while saving hash registration link: "
//                    + e.getMessage(), e);
//        }
//    }

    public void delete(String hash) throws RepositoryException {
        try {
            mapper.delete(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while deleting hash registration link: "
                    + e.getMessage(), e);
        }
    }

    public Integer find(String hash) throws RepositoryException {
        try {
            return mapper.find(hash);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving hash registration link: "
                    + e.getMessage(), e);
        }
    }
}
