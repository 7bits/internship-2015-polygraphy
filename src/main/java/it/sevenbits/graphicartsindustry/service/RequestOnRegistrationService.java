package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import it.sevenbits.graphicartsindustry.service.validators.RequestOnRegistrationValidator;
import it.sevenbits.graphicartsindustry.web.domain.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.domain.response.SuccessErrorsResponse;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.web.utils.UrlResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequestOnRegistrationService {
    private int min = 100000000;
    private int max = 999999999;

    @Autowired
    private RequestOnRegistrationValidator requestOnRegistrationValidator;

    @Autowired
    private SuccessErrorsResponse successErrorsResponse;

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    @Autowired
    private UrlResolver urlResolver;

    public List<RequestOnRegistrationModel> findAllRequestsOnRegistration() throws ServiceException {
        try {
            List<RequestOnRegistration> requestsOnRegistration =
                    requestOnRegistrationRepository.findAllRequestsOnRegistration();
            List<RequestOnRegistrationModel> models = new ArrayList<>(requestsOnRegistration.size());
            for (RequestOnRegistration r: requestsOnRegistration) {
                models.add(new RequestOnRegistrationModel(r.getId(), r.getEmail(), r.getHash(),
                        "http://" + urlResolver.getDomain() + "/registration?id=" + r.getHash()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while showing all requests on registration " +
                    e.getMessage(),e);
        }
    }

    public SuccessErrorsResponse sendRequestOnRegistration(RequestOnRegistrationForm form) throws ServiceException {
        try {
            SuccessErrorsResponse successErrorsResponse = new SuccessErrorsResponse();
            successErrorsResponse.setErrors(requestOnRegistrationValidator.validate(form));
            if (successErrorsResponse.getErrors().size() != 0) {
                form.setSuccess(false);
                return successErrorsResponse;
            }
            form.setSuccess(true);
            requestOnRegistrationRepository.createRequestOnRegistration(form.getEmail());
            return successErrorsResponse;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving email request on registration " +
                    e.getMessage(),e);
        }
    }

    public boolean isRequested (String email) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration =
                    requestOnRegistrationRepository.findRequestByEmail(email);
            if (requestOnRegistration != null)
                return true;
            else
                return false;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving request on registration by email ");
        }
    }

    public RequestOnRegistrationModel findRequestOnRegistrationByHash(String hash) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestByHash(hash);
            RequestOnRegistrationModel requestOnRegistrationModel =
                    new RequestOnRegistrationModel(requestOnRegistration.getId(), requestOnRegistration.getEmail(),
                            requestOnRegistration.getHash(), "http://" + urlResolver.getDomain() + "/registration?id=" +
                            requestOnRegistration.getHash());
            return requestOnRegistrationModel;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving request on registration by hash "
                    + e.getMessage(), e);
        }
    }

    public RequestOnRegistrationModel findRequestOnRegistrationById(int requestId) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestById(requestId);
            RequestOnRegistrationModel requestOnRegistrationModel =
                    new RequestOnRegistrationModel(requestOnRegistration.getId(), requestOnRegistration.getEmail(),
                            requestOnRegistration.getHash(), "http://" + urlResolver.getDomain() + "/registration?id=" +
                            requestOnRegistration.getHash());
            return requestOnRegistrationModel;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while retrieving  request on registration by id "
                    + e.getMessage(), e);
        }
    }

    public void removeRequestOnRegistration(String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationByHash(hash);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing request on registration ");
        }
    }

    public String generateAndSaveHash (int requestId) throws ServiceException {
        String hash = this.generateHash();
        this.saveHash(requestId, hash);
        return hash;
    }

    private void saveHash(int requestId, String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.editHash(requestId, hash);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving hash ");
        }
    }

    private String generateHash() throws ServiceException {
        try {
            int number = min + (int) (Math.random() * ((max - min) + 1));
            String hash = sha1(Integer.toString(number));
            return hash;
        }catch (Exception e) {
            throw new ServiceException("An error occurred while generating hash ");
        }
    }

    public static String sha1(String Param) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest SHA = MessageDigest.getInstance("SHA-1");
        SHA.reset();
        SHA.update(Param.getBytes("UTF-8"), 0, Param.length());
        byte[] sha1hash = SHA.digest();
        return bytesToHexStr(sha1hash);
    }

    public static String bytesToHexStr(byte[] raw) {
        char[] kDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int length = raw.length;
        char[] hex = new char[length * 2];
        for (int i = 0; i < length; i++) {
            int value = (raw[i] + 256) % 256;
            int highIndex = value >> 4;
            int lowIndex = value & 0x0f;
            hex[i * 2 + 0] = kDigits[highIndex];
            hex[i * 2 + 1] = kDigits[lowIndex];
        }
        return new String(hex);
    }

    public void removeRequestOnRegistration(int requestId) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationById(requestId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing request on registration ");
        }
    }
}
