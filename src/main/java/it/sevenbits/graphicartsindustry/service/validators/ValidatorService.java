package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.core.repository.*;
import it.sevenbits.graphicartsindustry.service.MessageByLocaleService;
import it.sevenbits.graphicartsindustry.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ValidatorService {

    private static final Logger LOG = Logger.getLogger(ValidatorService.class);

    @Autowired
    private MessageByLocaleService messageByLocaleService;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;;

    public void isRegistratedForParticularPolygraphy(String email, Integer polygraphyId, Map<String, String> errors,
                                                     final String field, String key) throws ServiceException {
        try {
            if (email != null && !errors.containsKey(field)) {
                if (userRepository.findUserByUsername(email) != null ||
                        polygraphyContactRepository.getPolygraphyIdByEmail(email) != null) {
                    Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
                    String userEmail = userRepository.findEmailById(userId);
                    String polygraphyEmail = polygraphyRepository.findPolygraphy(polygraphyId).getEmail();
                    if (!(userEmail.equals(email) || polygraphyEmail.equals(email))) {
                        errors.put(field, key);
                    }
                }
            }
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.validator_service.registrated_for_particular_polygraphy"));
        }
    }

    public void isRegistrated(String email, Map<String, String> errors, String field, String key)
            throws ServiceException {
        try {
            if (email != null && !errors.containsKey(field)) {
                if (userRepository.findUserByUsername(email) != null ||
                        polygraphyContactRepository.getPolygraphyIdByEmail(email) != null) {
                    errors.put(field, key);
                }
            }
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.validator_service.registrated"));
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
        }  catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.validator_service.requested"));
        }
    }
}
