package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyContactMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "contactRepository")
public class PolygraphyContactRepository {

    private static Logger LOG = Logger.getLogger(ContentRepository.class);

    @Autowired
    private PolygraphyContactMapper polygraphyContactMapper;

    public String getPolygraphyPublicEmail(String email) throws RepositoryException {
        try {
            return polygraphyContactMapper.getEmail(email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving polygraphy public email " +
                    e.getMessage(), e);
        }
    }


    public void createPolygraphyContacts(int polygraphyId, String address, String phone, String email, String website)
            throws RepositoryException {
        try {
            polygraphyContactMapper.insertContacts(polygraphyId, address, phone, email, website);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while creating contacts of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyAddress(int polygraphyId, String address)
            throws RepositoryException {
        try {
            polygraphyContactMapper.updateAddress(polygraphyId, address);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing contact address of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyPhone(int polygraphyId, String phone)
            throws RepositoryException {
        try {
            polygraphyContactMapper.updatePhone(polygraphyId, phone);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing contact phone of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyEmail(int polygraphyId, String email)
            throws RepositoryException {
        try {
            polygraphyContactMapper.updateEmail(polygraphyId, email);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing contact email of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyWebsite(int polygraphyId, String website)
            throws RepositoryException {
        try {
            polygraphyContactMapper.updateWebsite(polygraphyId, website);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while editing contact website of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void removePolygraphyContacts(int polygraphyId) throws RepositoryException {
        try {
            polygraphyContactMapper.deleteContacts(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while removing contacts of polygraphy " +
                    e.getMessage(), e);
        }
    }
}
