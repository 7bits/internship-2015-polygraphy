package it.sevenbits.graphicartsindustry.web.service.registration;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.*;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;

    public void saveRegistrationForm(RegistrationFirstForm firstForm, RegistrationSecondForm secondForm)
            throws ServiceException {

        User user = new User();
        user.setEmail(firstForm.getEmail());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(firstForm.getPassword()));
        user.setRole(Role.ROLE_POLYGRAPHY);
        user.setEnabled(true);

        try {
            userRepository.createUser(user);

//            User user = userRepository.createUser(firstForm.getEmail(), firstForm.getPassword(),
//                    Role.ROLE_POLYGRAPHY);

            Polygraphy polygraphy = new Polygraphy(null, firstForm.getName(), secondForm.getWritesTheCheck(),
                    secondForm.getOrderByEmail(), firstForm.getInfo(), user.getId());
            polygraphyRepository.createPolygraphy(polygraphy);

            int polygraphyId = polygraphy.getId();

            polygraphyContactRepository.createPolygraphyContacts(polygraphyId, firstForm.getAddress(), firstForm.getPhone(),
                    firstForm.getPublicEmail(), firstForm.getWebsite());


            for (Integer p : secondForm.getPaymentMethods()) {
                if (p != null)
                    polygraphyServicesRepository.createPolygraphyPaymentMethod(polygraphyId, p);
            }

            for (Integer d : secondForm.getDeliveryMethods()) {
                if (d != null)
                    polygraphyServicesRepository.createPolygraphyDeliveryMethod(polygraphyId, d);
            }

            for (Integer s : secondForm.getServices()) {
                if (s != null)
                    polygraphyServicesRepository.createPolygraphyService(polygraphyId, s);
            }

        } catch (Exception e) {
        throw new ServiceException("An error occurred while saving registration form polygraphy "
                + e.getMessage(), e);
        }
    }


//    public boolean isRegistrated (String email) throws ServiceException {
//        try {
//            String returnedEmail = registrationRepository.findUserByEmail(email);
//            if (returnedEmail!=null)
//                return true;
//            else
//                return false;
//        } catch (Exception e) {
//            throw new ServiceException("An error occurred while finding email in users");
//        }
//    }
}
