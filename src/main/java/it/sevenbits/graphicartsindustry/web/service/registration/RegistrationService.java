package it.sevenbits.graphicartsindustry.web.service.registration;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.RegistrationRepository;
import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.web.domain.content.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RequestOnRegistrationForm;
import it.sevenbits.graphicartsindustry.web.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class RegistrationService {
    private int min = 100000000;
    private int max = 999999999;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    public PolygraphyFullModel saveAll (RegistrationFirstForm firstForm, RegistrationSecondForm secondForm)
            throws ServiceException {
        try {
            User user = userRepository.createUser(firstForm.getEmail(), firstForm.getPassword(),
                    Role.ROLE_POLYGRAPHY);

            Polygraphy polygraphy = registrationRepository.createPolygraphy(firstForm.getName(), firstForm.getAddress(),
                    firstForm.getPhone(), firstForm.getPublicEmail(), secondForm.getOrderByEmail(),
                    firstForm.getWebsite(), firstForm.getInfo(), secondForm.getPaymentMethods(),
                    secondForm.getWritesTheCheck(), secondForm.getDeliveryMethods(),
                    secondForm.getServices(), user.getId());

            PolygraphyFullModel models = new PolygraphyFullModel(polygraphy.getId(), polygraphy.getName(),
                    polygraphy.getAddress(), polygraphy.getPhone(), polygraphy.getEmail(), polygraphy.getWebsite(),
                    polygraphy.getInfo());

            return models;
        } catch (Exception e) {
        throw new ServiceException("An error occurred while saving registration form polygraphy "
                + e.getMessage(), e);
        }
    }

    public void deleteAll (int polygraphyId) throws ServiceException {
        try {
            registrationRepository.deletePolygraphy(polygraphyId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while deleting polygraphy "
                    + e.getMessage(), e);
        }
        return;
    }

    public void saveRequestOnRegistration(RequestOnRegistrationForm form) throws ServiceException {
        try {
            registrationRepository.saveRequestOnRegistration(form.getEmail());
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving email request on registration " +
                    e.getMessage(),e);
        }
    }


    public String generateAndSaveHash (int id) throws ServiceException {
        String hash = this.generateHash();
        this.saveHash(hash, id);
        return hash;
    }

    private String generateHash() throws ServiceException {
        try {
            int number = min + (int) (Math.random() * ((max - min) + 1));
            String hash = sha1(Integer.toString(number));
            return hash;
        }catch (Exception e) {
            throw new ServiceException("An error occurred while generating hash");
        }
    }

    private void saveHash(String hash, int id) throws ServiceException {
        try {
            registrationRepository.saveHash(hash, id);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while saving hash");
        }
    }

    public void removeRequestOnRegistration(String hash) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistration(hash);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing request on registration");
        }
    }

    public boolean isRegistrated (String email) throws ServiceException {
        try {
            String returnedEmail = registrationRepository.findUserByEmail(email);
            if (returnedEmail!=null)
                return true;
            else
                return false;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while finding email in users");
        }
    }

    public boolean isRequested (String email) throws ServiceException {
        try {
            String returnedEmail = registrationRepository.findRequestByEmail(email);
            if (returnedEmail!=null)
                return true;
            else
                return false;
        } catch (Exception e) {
            throw new ServiceException("An error occurred while finding email in users");
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
}
