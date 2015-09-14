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

    public Integer getPolygraphyIdByEmail(String email) throws RepositoryException {
        if (email == null) {
            LOG.error("Can not get polygraphy id by email due to repository error: email is null");
            throw new RepositoryException("Email is null");
        }
        try {
            return polygraphyContactMapper.getPolygraphyIdByEmail(email);
        } catch (Exception e) {
            LOG.error("Can not get polygraphy id by email due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while getting polygraphy id by public email " +
                    e.getMessage(), e);
        }
    }

    public void createPolygraphyContacts(Integer polygraphyId, String address, String phone, String email,
                                         String website) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not create polygraphy contacts due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyContactMapper.insertContacts(polygraphyId, address, phone, email, website);
        } catch (Exception e) {
            LOG.error("Can not create polygraphy contacts due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating contacts of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyAddress(Integer polygraphyId, String address) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit polygraphy address due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyContactMapper.updateAddress(polygraphyId, address);
        } catch (Exception e) {
            LOG.error("Can not edit polygraphy address due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing contact address of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyPhone(Integer polygraphyId, String phone) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit polygraphy phone due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyContactMapper.updatePhone(polygraphyId, phone);
        } catch (Exception e) {
            LOG.error("Can not edit polygraphy phone due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing contact phone of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyEmail(Integer polygraphyId, String email) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit polygraphy email due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyContactMapper.updateEmail(polygraphyId, email);
        } catch (Exception e) {
            LOG.error("Can not edit polygraphy email due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing contact email of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void editPolygraphyWebsite(Integer polygraphyId, String website) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not edit polygraphy website due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyContactMapper.updateWebsite(polygraphyId, website);
        } catch (Exception e) {
            LOG.error("Can not edit polygraphy website due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing contact website of polygraphy " +
                    e.getMessage(), e);
        }
    }

    public void removePolygraphyContacts(Integer polygraphyId) throws RepositoryException {
        if (polygraphyId == null) {
            LOG.error("Can not remove polygraphy contacts due to repository error: polygraphy id is null");
            throw new RepositoryException("Polygraphy ID is null");
        }
        try {
            polygraphyContactMapper.deleteContacts(polygraphyId);
        } catch (Exception e) {
            LOG.error("Can not remove polygraphy contacts due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing contacts of polygraphy " +
                    e.getMessage(), e);
        }
    }
}
