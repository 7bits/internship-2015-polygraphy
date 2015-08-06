package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.RegistrationBasic;
import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import it.sevenbits.graphicartsindustry.core.mappers.RegistrationLinkMapper;
import it.sevenbits.graphicartsindustry.core.mappers.RegistrationMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "registrationRepository")
public class RegistrationRepository {

    private static Logger LOG = Logger.getLogger(RegistrationRepository.class);

    @Autowired
    private RegistrationMapper mapper;

    @Autowired
    private RegistrationLinkMapper linkMapper;

    public Polygraphy createPolygraphy(String name, String address, String phone, String email,
                                       Boolean order, String website, String info,
                                       List<Integer> paymentMethods, Boolean check,
                                       List<Integer> deliveryMethods, List<Integer> services,
                                       Integer userId) throws RepositoryException {
//    public void saveAll(String name, Boolean check, Boolean order, String address, String email,
//                        String website, String phone, List<Integer> paymentMethods,
//                        List<Integer> deliveryMethods, List<Integer> services) throws RepositoryException {RepositoryException
        try {
            RegistrationBasic registrationBasic = new RegistrationBasic(null, name, check, order, info, userId);
            mapper.savePolygraphyBasic(registrationBasic);

            int polygraphyId = registrationBasic.getId();

            Polygraphy polygraphy = new Polygraphy();
            polygraphy.setId(polygraphyId);
            polygraphy.setName(name);
            polygraphy.setAddress(address);
            polygraphy.setPhone(phone);
            polygraphy.setEmail(email);
            polygraphy.setWebsite(website);
            polygraphy.setInfo(info);

            mapper.savePolygraphyContacts(polygraphyId, address, email, website, phone);

            if (paymentMethods != null) {
                for (Integer p : paymentMethods) {
                    if (p != null)
                        mapper.savePolygraphyPaymentMethod(polygraphyId, p);
                }
            }

            if (deliveryMethods != null) {
                for (Integer d : deliveryMethods) {
                    if (d != null)
                        mapper.savePolygraphyDeliveryMethod(polygraphyId, d);
                }
            }

            if (services != null) {
                for (Integer s : services) {
                    if (s != null)
                        mapper.savePolygraphyService(polygraphyId, s);
                }
            }
            return polygraphy;
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving registration form polygraphy "
                    + e.getMessage(), e);
        }
    }

    public void deletePolygraphy(int polygraphyId) throws RepositoryException {
        try {
            mapper.deletePolygraphyServices(polygraphyId);
            mapper.deletePolygraphyDeliveryMethods(polygraphyId);
            mapper.deletePolygraphyPaymentMethods(polygraphyId);
            mapper.deletePolygraphyContacts(polygraphyId);

            mapper.deletePolygraphyBasic(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while deleting polygraphy "
                    + e.getMessage(), e);
        }
    }

    public void saveRequestOnRegistration(String email) throws RepositoryException {
        try {
            mapper.saveRequestOnRegistration(email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving email request on registration "
                    + e.getMessage(), e);
        }
    }

    public List<RequestOnRegistration> findAllRequestOnRegistration() throws RepositoryException {
        try {
            return mapper.findAllRequestOnRegistration();
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while findind model request on registration "
                    + e.getMessage(), e);
        }
    }

    public void saveHash(String hash, int id) throws RepositoryException {
        try {
            linkMapper.save(hash, id);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving hash registration link: "
                    + e.getMessage(), e);
        }
    }
}