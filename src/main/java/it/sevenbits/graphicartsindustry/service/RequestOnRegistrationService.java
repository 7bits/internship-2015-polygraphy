package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import it.sevenbits.graphicartsindustry.service.validators.RequestOnRegistrationValidator;
import it.sevenbits.graphicartsindustry.web.domain.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.domain.response.ValidatorResponse;
import it.sevenbits.graphicartsindustry.web.forms.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.web.utils.RegistrationLinkResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequestOnRegistrationService {

    @Autowired
    private SendingMessagesService sendingMessagesService;

    @Autowired
    private RequestOnRegistrationValidator requestOnRegistrationValidator;

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    @Autowired
    private RegistrationLinkResolver registrationLinkResolver;

    public List<RequestOnRegistrationModel> findAllRequestsOnRegistration() throws ServiceException {
        try {
            List<RequestOnRegistration> requestsOnRegistration =
                    requestOnRegistrationRepository.findAllRequestsOnRegistration();
            List<RequestOnRegistrationModel> models = new ArrayList<>(requestsOnRegistration.size());
            for (RequestOnRegistration r: requestsOnRegistration) {
                models.add(new RequestOnRegistrationModel(r.getId(), r.getEmail(), r.getHash(),
                        "http://" + registrationLinkResolver.getDomain() + "/registration?id=" + r.getHash()));
            }
            return models;
        } catch (Exception e) {
            throw new ServiceException("Can not find request on registration. ");
        }
    }

    public RequestOnRegistrationModel findRequestOnRegistrationById(int requestId) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestById(requestId);
            RequestOnRegistrationModel requestOnRegistrationModel =
                    new RequestOnRegistrationModel(requestOnRegistration.getId(), requestOnRegistration.getEmail(),
                            requestOnRegistration.getHash(), "http://" + registrationLinkResolver.getDomain() + "/registration?id=" +
                            requestOnRegistration.getHash());
            return requestOnRegistrationModel;
        } catch (Exception e) {
            throw new ServiceException("Can not find request on registration. ");
        }
    }

    public RequestOnRegistrationModel findRequestOnRegistrationByHash(String hash) throws ServiceException {
        try {
            RequestOnRegistration requestOnRegistration = requestOnRegistrationRepository.findRequestByHash(hash);
            RequestOnRegistrationModel requestOnRegistrationModel =
                    new RequestOnRegistrationModel(requestOnRegistration.getId(), requestOnRegistration.getEmail(),
                            requestOnRegistration.getHash(), "http://" + registrationLinkResolver.getDomain() + "/registration?id=" +
                            requestOnRegistration.getHash());
            return requestOnRegistrationModel;
        } catch (Exception e) {
            throw new ServiceException("Can not find request on registration. ");
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
        } catch (Exception e) {
            throw new ServiceException("Can not save request on registration. ");
        }
    }

    public boolean isRequested (String email) throws ServiceException {
        try {
            if (requestOnRegistrationRepository.findRequestByEmail(email) != null)
                return true;
            else
                return false;
        } catch (Exception e) {
            throw new ServiceException("Can not verify the existence of email in the list of registration requests. ");
        }
    }

    public RequestOnRegistrationModel sendRegistrationLink(Integer requestId) throws ServiceException {
        try {
            String hash = generateHashRegistrationLink();
            saveHashRegistrationLink(requestId, hash);
            RequestOnRegistrationModel requestOnRegistrationModel = this.findRequestOnRegistrationById(requestId);
            sendingMessagesService.sendingRegistrationLink(requestOnRegistrationModel);
            return requestOnRegistrationModel;
        } catch (ServiceException e) {
            throw new ServiceException("Can not generate or save registration link: " + e.getMessage());
        } catch (MessagingException e) {
            throw new ServiceException("Can not send registration link. ");
        }
    }

    public String generateHashRegistrationLink() throws ServiceException {
        try {
            int number = registrationLinkResolver.getMinNumber() + (int) (Math.random() *
                    ((registrationLinkResolver.getMaxNumber() - registrationLinkResolver.getMinNumber()) + 1));
            String hash = sha1(Integer.toString(number));
            return hash;
        } catch (Exception e) {
            throw new ServiceException("can not generate registration link. ");
        }
    }

    private static String sha1(String Param) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest SHA = MessageDigest.getInstance("SHA-1");
        SHA.reset();
        SHA.update(Param.getBytes("UTF-8"), 0, Param.length());
        byte[] sha1hash = SHA.digest();
        return bytesToHexStr(sha1hash);
    }

    private static String bytesToHexStr(byte[] raw) {
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

    public void saveHashRegistrationLink(Integer requestId, String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.editHash(requestId, hash);
        } catch (Exception e) {
            throw new ServiceException("can not save registration link. ");
        }
    }

    public void removeRequestOnRegistrationById(Integer requestId) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationById(requestId);
        } catch (Exception e) {
            throw new ServiceException("Can not remove request on registration. ");
        }
    }

    public void removeRequestOnRegistrationByHash(String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistrationByHash(hash);
        } catch (Exception e) {
            throw new ServiceException("Can not remove request on registration. ");
        }
    }
}
