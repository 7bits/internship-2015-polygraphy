package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.*;
import it.sevenbits.graphicartsindustry.service.validators.EditingPolygraphyValidator;
import it.sevenbits.graphicartsindustry.service.validators.EditingUserValidator;
import it.sevenbits.graphicartsindustry.web.forms.EditingPolygraphyForm;
import it.sevenbits.graphicartsindustry.web.utils.UserResolver;
import it.sevenbits.graphicartsindustry.web.view.EditingPolygraphyModel;
import it.sevenbits.graphicartsindustry.web.view.response.ValidatorResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class EditingPolygraphyService {

    private static final Logger LOG = Logger.getLogger(EditingPolygraphyService.class);

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


    @Autowired
    private EditingUserValidator editingUserValidator;

    @Autowired
    private EditingPolygraphyValidator editingPolygraphyValidator;


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


    public EditingPolygraphyService() {
        this.customTx = new DefaultTransactionDefinition();
        this.customTx.setName(TX_NAME);
        this.customTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    }

    public EditingPolygraphyModel findFullInfoAboutPolygraphyByAdmin(Integer polygraphyId) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphy(polygraphyId);
            EditingPolygraphyModel model = null;
            if (polygraphyContacts != null) {
                model = new EditingPolygraphyModel(polygraphyId, null, null,
                        polygraphyContacts.getName(), polygraphyContacts.getAddress(), polygraphyContacts.getPhone(),
                        polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(), polygraphyContacts.getInfo(),
                        polygraphyRepository.isOrderByEmail(polygraphyId),
                        polygraphyServicesRepository.findPolygraphyPaymentMethods(polygraphyId),
                        polygraphyRepository.isWritesTheCheck(polygraphyId),
                        polygraphyServicesRepository.findPolygraphyDeliveryMethods(polygraphyId),
                        polygraphyServicesRepository.findPolygraphyServices(polygraphyId));
            }
            return model;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find full information about polygraphy. ");
        }
    }

    public EditingPolygraphyModel findFullInfoAboutPolygraphyByPolygraphy(Integer polygraphyId) throws ServiceException {
        try {
            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findPolygraphy(polygraphyId);
            EditingPolygraphyModel model = null;
            if (polygraphyContacts != null) {
                model = new EditingPolygraphyModel(polygraphyId, userRepository.findEmailById(userId), null,
                        polygraphyContacts.getName(), polygraphyContacts.getAddress(), polygraphyContacts.getPhone(),
                        polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(), polygraphyContacts.getInfo(),
                        polygraphyRepository.isOrderByEmail(polygraphyId),
                        polygraphyServicesRepository.findPolygraphyPaymentMethods(polygraphyId),
                        polygraphyRepository.isWritesTheCheck(polygraphyId),
                        polygraphyServicesRepository.findPolygraphyDeliveryMethods(polygraphyId),
                        polygraphyServicesRepository.findPolygraphyServices(polygraphyId));
            }
            return model;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find full information about polygraphy. ");
        }
    }

    public ValidatorResponse editPolygraphyByAdmin(EditingPolygraphyForm polygraphyForm)
            throws ServiceException {
        try {
            ValidatorResponse validatorResponse = validateEditingPolygraphy(polygraphyForm);
            if (validatorResponse.isSuccess()) {
                saveEditingPolygraphy(polygraphyForm);
            }
            return validatorResponse;
        } catch (ServiceException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    public ValidatorResponse editPolygraphyByPolygraphy(Integer polygraphyId, EditingPolygraphyForm polygraphyForm)
            throws ServiceException {
        try {
            ValidatorResponse validatorResponse = null;
            if (userResolver.getUsername().equals(findUserEmailByPolygraphyId(polygraphyId))) {
                validatorResponse = validateEditingUser(polygraphyForm);
                if (validatorResponse.isSuccess()) {
                    validatorResponse = validateEditingPolygraphy(polygraphyForm);
                    if (validatorResponse.isSuccess()) {
                        saveEditingPolygraphyByPolygraphy(polygraphyForm);
                        return validatorResponse;
                    }
                    return validatorResponse;
                }
                return validatorResponse;
            }
            validatorResponse.setSuccess(false);
            validatorResponse.addErrors("base", "Ссылка на изменение недоступна. ");
            return validatorResponse;
        } catch (ServiceException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    private ValidatorResponse validateEditingUser(EditingPolygraphyForm polygraphyForm) throws ServiceException {
        try {
            ValidatorResponse validatorResponse = new ValidatorResponse();
            validatorResponse.setErrors(editingUserValidator.validate(polygraphyForm));
            if (validatorResponse.getErrors().size() != 0) {
                validatorResponse.setSuccess(false);
                return validatorResponse;
            }
            validatorResponse.setSuccess(true);
            return validatorResponse;
        } catch (ServiceException e) {
            throw new ServiceException("Can not validate editing user. " + e.getMessage());
        }
    }

    private ValidatorResponse validateEditingPolygraphy(EditingPolygraphyForm polygraphyForm)
            throws ServiceException {
        try {
            ValidatorResponse validatorResponse = new ValidatorResponse();
            validatorResponse.setErrors(editingPolygraphyValidator.validate(polygraphyForm));
            if (validatorResponse.getErrors().size() != 0) {
                validatorResponse.setSuccess(false);
                return validatorResponse;
            }
            validatorResponse.setSuccess(true);
            return validatorResponse;
        } catch (ServiceException e) {
            throw new ServiceException("Can not validate editing polygraphy. " + e.getMessage());
        }
    }

    private void saveEditingPolygraphyByPolygraphy(EditingPolygraphyForm polygraphyForm) throws ServiceException {
        TransactionStatus status = null;
        try {
            status = txManager.getTransaction(customTx);

            saveEditingUser(polygraphyForm);
            saveEditingPolygraphy(polygraphyForm);

            txManager.rollback(status);
        } catch (ServiceException e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException(e.getMessage());
        }
    }

    private void saveEditingUser(EditingPolygraphyForm polygraphyForm) throws ServiceException {
        TransactionStatus status = null;
        try {
            status = txManager.getTransaction(customTx);

            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyForm.getPolygraphyId());
            userRepository.editEmail(userId, polygraphyForm.getEmail());
            if (polygraphyForm.getPassword() != null && !polygraphyForm.getPassword().isEmpty()) {
                PasswordEncoder encoder = new BCryptPasswordEncoder();
                userRepository.editPassword(userId, encoder.encode(polygraphyForm.getPassword()));
            }

            txManager.rollback(status);
        } catch (RepositoryException e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException("Can not save editing user path. ");
        }
    }

    private void saveEditingPolygraphy(EditingPolygraphyForm polygraphyForm) throws ServiceException {
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
                    polygraphyForm.getPublicEmail());
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
        } catch (RepositoryException e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException("Can not save editing polygraphy path. ");
        }
    }

    public void editConditionDisplayPolygraphy(Integer polygraphyId, Boolean lastCondition) throws ServiceException {
        try {
            Boolean curCondition = null;
            if (lastCondition != null) {
                curCondition = !lastCondition;
            }
            polygraphyRepository.editConditionDisplayPolygraphy(polygraphyId, curCondition);
        } catch (RepositoryException e) {
            throw new  ServiceException("Can not edit condition display polygraphy in search. ");
        }
    }

    public String findUserEmailByPolygraphyId(Integer polygraphyId) throws ServiceException {
        try {
            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);
            String userEmail = null;
            if (userId != null) {
                userEmail = userRepository.findEmailById(userId);
            }
            return userEmail;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find user polygraphy. ");
        }
    }
}
