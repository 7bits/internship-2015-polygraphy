package it.sevenbits.graphicartsindustry.service.validators;

import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyContactRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.service.RegistrationService;
import it.sevenbits.graphicartsindustry.service.RequestOnRegistrationService;
import it.sevenbits.graphicartsindustry.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class ValidatorService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    private RegistrationService registrationService;

    public void isRegistratedFindCompliance(final String value,
                                            final int valueId,
                                            final Map<String, String> errors,
                                            final String field,
                                            final String key) throws ServiceException {
        try {
            if (value != null && !errors.containsKey(field)) {
                Integer userId = polygraphyRepository.getUserIdByPolygraphyId(valueId);
                if (userId == null) {
                    throw new ServiceException("UserId is null");
                }
                User user = userRepository.findUserById(valueId);
                if (!user.getUsername().equals(value) ||
                        polygraphyRepository.findPolygraphy(valueId).getEmail().equals(value)) {
                    if (registrationService.isRegistrated(value) ||
                            polygraphyContactRepository.getPolygraphyIdByEmail(value) != null) {
                        errors.put(field, key);
                    }
                }
            }
        } catch (Exception e) {
            throw new ServiceException("Can not ");
        }
    }

    public void isRegistrated(final String value,
                              final Map<String, String> errors,
                              final String field,
                              final String key) throws ServiceException {
        try {
            if (value != null && !errors.containsKey(field)) {
                if (registrationService.isRegistrated(value) ||
                        polygraphyContactRepository.getPolygraphyIdByEmail(value) != null) {
                    errors.put(field, key);
                }
            }
        } catch (Exception e) {
            throw new ServiceException("Can not check registered email. ");
        }
    }

    public void isRequested(final String value,
                            final Map<String, String> errors,
                            final String field,
                            final String key) throws ServiceException {
        try {
            if (value != null && !errors.containsKey(field)) {
                if (requestOnRegistrationService.isRequested(value)) {
                    errors.put(field, key);
                }
            }
        } catch (Exception e) {
            throw new ServiceException("Can not check requested email. ");
        }
    }
}
