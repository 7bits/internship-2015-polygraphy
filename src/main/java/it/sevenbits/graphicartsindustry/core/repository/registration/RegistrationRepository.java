package it.sevenbits.graphicartsindustry.core.repository.registration;

import it.sevenbits.graphicartsindustry.core.mappers.RegistrationMapper;
import it.sevenbits.graphicartsindustry.core.repository.RepositoryException;
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

    public void saveAll(String name, Boolean check, Boolean order, String address, String email,
                     String website, String phone, List<Integer> paymentMethods,
                     List<Integer> deliveryMethods, List<Integer> services) throws RepositoryException {
        try {
            mapper.savePolygraphyBasic(name, check, order);

            int polygraphyId = mapper.findPolygraphyId(name);

            mapper.savePolygraphyContacts(polygraphyId, address, email, website, phone);

            for (Integer p : paymentMethods) {
                if (p!=null)
                    mapper.savePolygraphyPaymentMethod(polygraphyId, p);
            }

            for (Integer d : deliveryMethods) {
                if (d!=null)
                    mapper.savePolygraphyDeliveryMethod(polygraphyId, d);
            }

            for (Integer s : services) {
                if (s!=null)
                    mapper.savePolygraphyService(polygraphyId, s);
            }
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving registration form polygraphy "
                    + e.getMessage(), e);
        }
    }

    public void deleteAll(int polygraphyId) throws RepositoryException {
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
}