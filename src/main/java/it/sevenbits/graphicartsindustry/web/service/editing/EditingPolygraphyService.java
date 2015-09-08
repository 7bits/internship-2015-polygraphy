package it.sevenbits.graphicartsindustry.web.service.editing;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.*;
import it.sevenbits.graphicartsindustry.web.domain.PolygraphyForm;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EditingPolygraphyService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;

    public PolygraphyForm showFullInfoAboutPolygraphyByAdmin(int polygraphyId) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphy(polygraphyId);

            PolygraphyForm polygraphyForm = new PolygraphyForm(polygraphyId, null, null,
                    polygraphyContacts.getName(), polygraphyContacts.getAddress(), polygraphyContacts.getPhone(),
                    polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(), polygraphyContacts.getInfo(),
                    polygraphyRepository.isOrderByEmail(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyPaymentMethods(polygraphyId),
                    polygraphyRepository.isWritesTheCheck(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyDeliveryMethods(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyServices(polygraphyId));
            return polygraphyForm;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving full information " +
                    "about polygraphy " );
        }
    }

    public PolygraphyForm showFullInfoAboutPolygraphyByPolygraphy(int polygraphyId) throws ServiceException {
        try {
            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
            if (userId == null) {
                throw new ServiceException("UserId is null");
            }
            User user = userRepository.findUserById(polygraphyId);
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphy(polygraphyId);

            PolygraphyForm polygraphyForm = new PolygraphyForm(polygraphyId, user.getUsername(), null,
                    polygraphyContacts.getName(), polygraphyContacts.getAddress(), polygraphyContacts.getPhone(),
                    polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(), polygraphyContacts.getInfo(),
                    polygraphyRepository.isOrderByEmail(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyPaymentMethods(polygraphyId),
                    polygraphyRepository.isWritesTheCheck(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyDeliveryMethods(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyServices(polygraphyId));
            return polygraphyForm;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving full information " +
                    "about polygraphy ");
        }
    }

    public void saveEditingPolygraphy(PolygraphyForm polygraphyForm) throws ServiceException {
        try {

            polygraphyRepository.editPolygraphyName(polygraphyForm.getPolygraphyId(), polygraphyForm.getName());
            polygraphyRepository.editPolygraphyInfo(polygraphyForm.getPolygraphyId(), polygraphyForm.getInfo());
            polygraphyRepository.editPolygraphyOrderByEmail(polygraphyForm.getPolygraphyId(),
                    polygraphyForm.getOrderByEmail());
            polygraphyRepository.editPolygraphyWritesTheCheck(polygraphyForm.getPolygraphyId(),
                    polygraphyForm.getWritesTheCheck());

            polygraphyContactRepository.editPolygraphyAddress(polygraphyForm.getPolygraphyId(),
                    polygraphyForm.getAddress());
            polygraphyContactRepository.editPolygraphyPhone(polygraphyForm.getPolygraphyId(),
                    polygraphyForm.getPhone());
            polygraphyContactRepository.editPolygraphyEmail(polygraphyForm.getPolygraphyId(),
                    polygraphyForm.getEmail());
            polygraphyContactRepository.editPolygraphyWebsite(polygraphyForm.getPolygraphyId(),
                    polygraphyForm.getWebsite());

            polygraphyServicesRepository.removePolygraphyPaymentMethods(polygraphyForm.getPolygraphyId());
            polygraphyServicesRepository.removePolygraphyDeliveryMethods(polygraphyForm.getPolygraphyId());
            polygraphyServicesRepository.removePolygraphyServices(polygraphyForm.getPolygraphyId());

            for (Integer p : polygraphyForm.getPaymentMethods()) {
                if (p != null)
                    polygraphyServicesRepository.createPolygraphyPaymentMethod(polygraphyForm.getPolygraphyId(), p);
            }

            for (Integer d : polygraphyForm.getDeliveryMethods()) {
                if (d != null)
                    polygraphyServicesRepository.createPolygraphyDeliveryMethod(polygraphyForm.getPolygraphyId(), d);
            }

            for (Integer s : polygraphyForm.getServices()) {
                if (s != null)
                    polygraphyServicesRepository.createPolygraphyService(polygraphyForm.getPolygraphyId(), s);
            }

        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving editing information about polygraphy ");
        }

    }

    public void saveEditingPolygraphyByAdmin(PolygraphyForm polygraphyForm) throws ServiceException {
        try {
            this.saveEditingPolygraphy(polygraphyForm);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving editing information about polygraphy ");
        }
    }

    public void saveEditingPolygraphyByPolygraphy(PolygraphyForm polygraphyForm) throws ServiceException {
        Integer userId = null;
        try {
            userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyForm.getPolygraphyId());
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving userId by polygraphyId "
                    + e.getMessage(), e);
        }
        if (userId == null) {
            throw new ServiceException("UserId is null");
        }
        try {
            userRepository.editEmail(userId, polygraphyForm.getEmail());
            if (polygraphyForm.getPassword() !=null && !polygraphyForm.getPassword().isEmpty()) {
                PasswordEncoder encoder = new BCryptPasswordEncoder();
                userRepository.editPassword(userId, encoder.encode(polygraphyForm.getPassword()));
            }
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving editing information about user "
                    + e.getMessage(), e);
        }
        try {
            this.saveEditingPolygraphy(polygraphyForm);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving editing information about polygraphy ");
        }
    }

    public String findUserEmailByPolygraphyId(int polygraphyId) throws ServiceException {
        try {
            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
            if (userId == null) {
                throw new ServiceException("UserId is null");
            }
            User user = userRepository.findUserById(polygraphyId);
            return user.getUsername();
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving user by polygraphyId ");
        }
    }
}
