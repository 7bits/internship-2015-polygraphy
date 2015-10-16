package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import it.sevenbits.graphicartsindustry.service.exception.ForbidenException;
import it.sevenbits.graphicartsindustry.service.exception.ServiceException;
import it.sevenbits.graphicartsindustry.service.validators.RequestOnRegistrationValidator;
import it.sevenbits.graphicartsindustry.web.exception.NotFoundException;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.web.utils.RegistrationLinkResolver;
import it.sevenbits.graphicartsindustry.web.view.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.view.response.ValidatorResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequestOnRegistrationService {

    private static final Logger LOG = Logger.getLogger(RequestOnRegistrationService.class);

    @Autowired
    private MessageByLocaleService messageByLocaleService;


    @Autowired
    private SendingMessagesService sendingMessagesService;


    @Autowired
    private RequestOnRegistrationValidator requestOnRegistrationValidator;


    @Autowired
    private RegistrationLinkResolver registrationLinkResolver;


    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    public List<RequestOnRegistrationModel> findAllRequestsOnRegistration() throws ServiceException {
        try {
            List<RequestOnRegistration> requestsOnRegistration =
                    requestOnRegistrationRepository.findAllRequestsOnRegistration();
            List<RequestOnRegistrationModel> models = null;
            if (requestsOnRegistration != null) {
                models = new ArrayList<>(requestsOnRegistration.size());
                for (RequestOnRegistration r : requestsOnRegistration) {
                    models.add(new RequestOnRegistrationModel(r.getId(), r.getEmail(), r.getHash(),
                            "http://" + registrationLinkResolver.getDomain() + "/registration?id=" + r.getHash()));
                }
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.find_all_requests_on_registration"));
        }
    }

    public RequestOnRegistrationModel findRequestOnRegistrationById(int requestId) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestById(requestId);
            RequestOnRegistrationModel model = null;
            if (requestOnRegistration != null) {
                model = new RequestOnRegistrationModel(requestOnRegistration.getId(), requestOnRegistration.getEmail(),
                        requestOnRegistration.getHash(), "http://" + registrationLinkResolver.getDomain() +
                        "/registration?id=" + requestOnRegistration.getHash());
            }
            return model;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.find_request_on_registration_by_id"));
        }
    }

    public RequestOnRegistrationModel findRequestOnRegistrationByHash(String hash) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestByHash(hash);
            RequestOnRegistrationModel model = null;
            if (requestOnRegistration != null) {
                model = new RequestOnRegistrationModel(requestOnRegistration.getId(),
                        requestOnRegistration.getEmail(), requestOnRegistration.getHash(),
                        "http://" + registrationLinkResolver.getDomain() + "/registration?id=" +
                                requestOnRegistration.getHash());
            }
            return model;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.find_request_on_registration_by_hash"));
        }
    }

    public void checkRequestOnRegistrationByHash(String hash) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestByHash(hash);
            if (requestOnRegistration == null) {
                throw new ForbidenException();
            }
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.find_request_on_registration_by_hash"));
        }
    }

    public ValidatorResponse saveRequestOnRegistration(RequestOnRegistrationForm form) throws ServiceException {
        try {
            ValidatorResponse validatorResponse = new ValidatorResponse();
            validatorResponse.setErrors(requestOnRegistrationValidator.validate(form));
            if (validatorResponse.getErrors().size() != 0) {
                validatorResponse.setSuccess(false);
                return validatorResponse;
            }
            validatorResponse.setSuccess(true);
            requestOnRegistrationRepository.createRequestOnRegistration(form.getEmail());
            return validatorResponse;
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.save_request_on_registration"));
        }
    }

    public RequestOnRegistrationModel sendRegistrationLink(Integer requestId) throws ServiceException {
        try {
            String hash = generateHashRegistrationLink();
            saveHashRegistrationLink(requestId, hash);

            RequestOnRegistrationModel requestOnRegistrationModel = findRequestOnRegistrationById(requestId);
            sendingMessagesService.sendRegistrationLink(requestOnRegistrationModel);

            return requestOnRegistrationModel;
        } catch (ServiceException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    private String generateHashRegistrationLink() throws ServiceException {
        return RandomStringUtils.random(registrationLinkResolver.getLength(), registrationLinkResolver.getBasisForHash());
    }

    private void saveHashRegistrationLink(Integer requestId, String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.editHash(requestId, hash);
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.save_registration_link"));
        }
    }

    public void removeRequestOnRegistrationById(Integer requestId) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationById(requestId);
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.remove_request_on_registration_by_id"));
        }
    }

    public void removeRequestOnRegistrationByHash(String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationByHash(hash);
        } catch (RepositoryException e) {
            throw new ServiceException(messageByLocaleService.getMessage("error.request_on_registration_service.remove_request_on_registration_by_hash"));
        }
    }
}
