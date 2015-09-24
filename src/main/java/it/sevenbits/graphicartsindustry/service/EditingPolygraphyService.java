package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyContactRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyRepository;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyServicesRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.service.validators.EditingPolygraphyFormByAdminValidator;
import it.sevenbits.graphicartsindustry.service.validators.EditingPolygraphyFormByPolygraphyValidator;
import it.sevenbits.graphicartsindustry.web.domain.response.ValidatorResponse;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.HashMap;

@Service
public class EditingPolygraphyService {
    private static final Logger LOG = Logger.getLogger(EditingPolygraphyService.class);

    @Autowired
    private EditingPolygraphyFormByAdminValidator editingPolygraphyFormByAdminValidator;

    @Autowired
    private EditingPolygraphyFormByPolygraphyValidator editingPolygraphyFormByPolygraphyValidator;

    @Autowired
    private UserResolver userResolver;

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

    public EditingPolygraphyService() {
        this.customTx = new DefaultTransactionDefinition();
        this.customTx.setName(TX_NAME);
        this.customTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    }

    public EditingPolygraphyForm findFullInfoAboutPolygraphyByAdmin(int polygraphyId) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphy(polygraphyId);
            EditingPolygraphyForm polygraphyForm = new EditingPolygraphyForm(polygraphyId, null, null,
                    polygraphyContacts.getName(), polygraphyContacts.getAddress(), polygraphyContacts.getPhone(),
                    polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(), polygraphyContacts.getInfo(),
                    polygraphyRepository.isOrderByEmail(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyPaymentMethods(polygraphyId),
                    polygraphyRepository.isWritesTheCheck(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyDeliveryMethods(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyServices(polygraphyId));
            return polygraphyForm;
        } catch (Exception e) {
            throw new ServiceException("Can not find full information about polygraphy. ");
        }
    }

    public EditingPolygraphyForm findFullInfoAboutPolygraphyByPolygraphy(int polygraphyId) throws ServiceException {
        try {
            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
            if (userId == null) {
                throw new ServiceException("UserId is null");
            }
            User user = userRepository.findUserById(userId);
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphy(polygraphyId);
            EditingPolygraphyForm polygraphyForm = new EditingPolygraphyForm(polygraphyId, user.getUsername(), null,
                    polygraphyContacts.getName(), polygraphyContacts.getAddress(), polygraphyContacts.getPhone(),
                    polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(), polygraphyContacts.getInfo(),
                    polygraphyRepository.isOrderByEmail(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyPaymentMethods(polygraphyId),
                    polygraphyRepository.isWritesTheCheck(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyDeliveryMethods(polygraphyId),
                    polygraphyServicesRepository.findPolygraphyServices(polygraphyId));
            return polygraphyForm;
        } catch (Exception e) {
            throw new ServiceException("Can not find full information about polygraphy. ");
        }
    }

    public void saveEditingPolygraphy(EditingPolygraphyForm polygraphyForm) throws ServiceException {
        TransactionStatus status = null;
        try {
            status = txManager.getTransaction(customTx);
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
            txManager.commit(status);
        } catch (Exception e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException("Can not save editing polygraphy. ");
        }

    }

    public ValidatorResponse editPolygraphyByAdmin(EditingPolygraphyForm editingPolygraphyForm)
            throws ServiceException {
        try {
            ValidatorResponse validatorResponse = new ValidatorResponse();
            validatorResponse.setErrors(editingPolygraphyFormByAdminValidator.validate(editingPolygraphyForm));
            if (validatorResponse.getErrors().size() != 0) {
                validatorResponse.setSuccess(false);
                return validatorResponse;
            }
            this.saveEditingPolygraphy(editingPolygraphyForm);
            validatorResponse.setSuccess(true);
            return validatorResponse;
        } catch (Exception e) {
            throw new ServiceException("Can not validate or save editing polygraphy. ");
        }
    }

    public void saveEditingPolygraphyByPolygraphy(EditingPolygraphyForm polygraphyForm) throws ServiceException {
        TransactionStatus status = null;
        Integer userId = null;
        try {
            status = txManager.getTransaction(customTx);
            userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyForm.getPolygraphyId());
            if (userId == null) {
                throw new ServiceException("UserId is null");
            }
            userRepository.editEmail(userId, polygraphyForm.getEmail());
            if (polygraphyForm.getPassword() !=null && !polygraphyForm.getPassword().isEmpty()) {
                PasswordEncoder encoder = new BCryptPasswordEncoder();
                userRepository.editPassword(userId, encoder.encode(polygraphyForm.getPassword()));
            }
            this.saveEditingPolygraphy(polygraphyForm);
            txManager.rollback(status);
        } catch (Exception e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException("Can not save editing polygraphy. ");
        }
    }

    public ValidatorResponse editPolygraphyByPolygraphy(int polygraphyId, EditingPolygraphyForm editingPolygraphyForm)
            throws ServiceException {
        try {
            ValidatorResponse validatorResponse = new ValidatorResponse();
            if (userResolver.getUsername().equals(this.findUserEmailByPolygraphyId(polygraphyId))) {
                validatorResponse.setErrors(editingPolygraphyFormByPolygraphyValidator.validate(editingPolygraphyForm));
                if (validatorResponse.getErrors().size() != 0) {
                    validatorResponse.setSuccess(false);
                    return validatorResponse;
                }
                this.saveEditingPolygraphyByPolygraphy(editingPolygraphyForm);
                validatorResponse.setSuccess(true);
                return validatorResponse;
            }
            HashMap<String, String> errors = new HashMap<>();
            errors.put("base", "Ссылка на изменение устарела");
            validatorResponse.setErrors(errors);
            validatorResponse.setSuccess(false);
            return validatorResponse;
        } catch (Exception e) {
            throw new ServiceException("Can not validate or save editing polygraphy. ");
        }
    }

    public void editConditionDisplayPolygraphy(Integer polygraphyId, boolean curCondition) throws ServiceException {
        try {
            polygraphyRepository.editConditionDisplayPolygraphy(polygraphyId, !curCondition);
        } catch (Exception e) {
            throw new  ServiceException("Can not edit condition display polygraphy in search. ");
        }
    }

    public String findUserEmailByPolygraphyId(int polygraphyId) throws ServiceException {
        Integer userId = null;
        try {
            userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
            User user = userRepository.findUserById(userId);
            return user.getUsername();
        } catch (Exception e) {
            throw new ServiceException("Error. ");
        }
    }
}
