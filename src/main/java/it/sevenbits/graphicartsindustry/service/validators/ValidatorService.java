package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.core.repository.PolygraphyContactRepository;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ValidatorService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;;

//    public void isRegistratedFindCompliance(String email, Integer polygraphyId, Map<String, String> errors,
//                                            final String field, String key) throws ServiceException {
//        try {
//            if (email != null && !errors.containsKey(field)) {
//                Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
//                String userEmail = userRepository.findEmailById(userId);
//                String polygraphyEmail = polygraphyRepository.findPolygraphy(polygraphyId).getEmail();
//                if (!userEmail.equals(email) || polygraphyEmail.equals(email)) {
//                    if (userRepository.findUserByUsername(email) != null ||
//                            polygraphyContactRepository.getPolygraphyIdByEmail(email) != null) {
//                        errors.put(field, key);
//                    }
//                }
//            }
//        } catch (RepositoryException repositoryExeption) {
//            throw new ServiceException("Can not validate email. ");
//        }
//    }

    public void isRegistrated(String email, Map<String, String> errors, String field, String key)
            throws ServiceException {
        try {
            if (email != null && !errors.containsKey(field)) {
                if (userRepository.findUserByUsername(email) != null ||
                        polygraphyContactRepository.getPolygraphyIdByEmail(email) != null) {
                    errors.put(field, key);
                }
            }
        } catch (RepositoryException repositoryExeption) {
            throw new ServiceException("Can not validate email. ");
        }
    }

    public void isRequested(String email, Map<String, String> errors, String field, String key)
            throws ServiceException {
        try {
            if (email != null && !errors.containsKey(field)) {
                if (requestOnRegistrationRepository.findRequestByEmail(email) != null) {
                    errors.put(field, key);
                }
            }
        }  catch (RepositoryException repositoryExeption) {
            throw new ServiceException("Can not validate email. ");
        }
    }
}
