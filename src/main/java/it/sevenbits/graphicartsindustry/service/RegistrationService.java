package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyContactRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyServicesRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.service.validators.RegistrationFirstFormValidator;
import it.sevenbits.graphicartsindustry.service.validators.RegistrationSecondFormValidator;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.forms.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.view.response.ValidatorResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.Map;

@Service
public class RegistrationService {
    private static final Logger LOG = Logger.getLogger(RegistrationService.class);

    @Autowired
    private RegistrationFirstFormValidator firstFormValidator;

    @Autowired
    private RegistrationSecondFormValidator secondFormValidator;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;

    private static final String TX_NAME = "txService";
    /**
     * Spring Transaction Manager
     */
    @Autowired
    private PlatformTransactionManager txManager;
    /**
     * Transaction settings object
     */
    private DefaultTransactionDefinition customTx;

    public RegistrationService() {
        this.customTx = new DefaultTransactionDefinition();
        this.customTx.setName(TX_NAME);
        this.customTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    }

    public ValidatorResponse validateFirstRegistrationForm(RegistrationFirstForm registrationFirstForm) throws ServiceException {
        ValidatorResponse validatorResponse = new ValidatorResponse();
        try {
            final Map<String, String> errorsFirstForm = firstFormValidator.validate(registrationFirstForm);
            if (errorsFirstForm.size() != 0) {
                validatorResponse.setErrors(errorsFirstForm);
                validatorResponse.setSuccess(false);
                return validatorResponse;
            }
            validatorResponse.setSuccess(true);
            return validatorResponse;
        } catch (Exception e) {
            throw new ServiceException("");
        }
    }

    public ValidatorResponse validateSecondRegistrationForm(RegistrationSecondForm registrationSecondForm) throws ServiceException {
        ValidatorResponse validatorResponse = new ValidatorResponse();
        try {
            final Map<String, String> errorsFirstForm = secondFormValidator.validate(registrationSecondForm);
            if (errorsFirstForm.size() != 0) {
                validatorResponse.setErrors(errorsFirstForm);
                validatorResponse.setSuccess(false);
                return validatorResponse;
            }
            validatorResponse.setSuccess(true);
            return validatorResponse;
        } catch (Exception e) {
            throw new ServiceException("");
        }
    }

    public void saveRegistrationForm(RegistrationFirstForm firstForm, RegistrationSecondForm secondForm)
            throws ServiceException {
        TransactionStatus status = null;
        try {
            User user = new User();
            user.setEmail(firstForm.getEmail());
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            user.setPassword(encoder.encode(firstForm.getPassword()));
            user.setRole(Role.ROLE_POLYGRAPHY);
            user.setEnabled(true);

            status = txManager.getTransaction(customTx);
            userRepository.createUser(user);

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
            txManager.commit(status);
        } catch (Exception e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException("Can not register polygraphy. ");
        }
    }

    public boolean isRegistrated(String email) throws ServiceException {
        try {
            return userRepository.findUserByUsername(email) != null;
        } catch (Exception e) {
            throw new ServiceException("Can not verify the existence of email in the list of registration requests. ");
        }
    }
}
