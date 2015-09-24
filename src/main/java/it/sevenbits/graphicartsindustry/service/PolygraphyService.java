package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
import it.sevenbits.graphicartsindustry.core.repository.*;
import it.sevenbits.graphicartsindustry.web.view.polygraphy.PolygraphyAdminModel;
import it.sevenbits.graphicartsindustry.web.view.polygraphy.PolygraphyFullModel;
import it.sevenbits.graphicartsindustry.web.view.polygraphy.PolygraphyMinModel;
import it.sevenbits.graphicartsindustry.web.forms.SearchForm;
import it.sevenbits.graphicartsindustry.web.utils.SearchPolygraphyResolver;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolygraphyService {
    private static final Logger LOG = Logger.getLogger(PolygraphyService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;

    @Autowired
    private SearchPolygraphyResolver searchPolygraphyResolver;

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

    public PolygraphyService() {
        this.customTx = new DefaultTransactionDefinition();
        this.customTx.setName(TX_NAME);
        this.customTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    }

    public List<PolygraphyAdminModel> findAllPolygraphies() throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findAllPolygraphies();
            List<PolygraphyAdminModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyAdminModel(p.getId(), p.getName(), p.getEmail(), p.isDisplayed()));
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find all polygraphies. ");
        }
    }

    public List<PolygraphyMinModel> findAllDisplayPolygraphies() throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies =
                    polygraphyRepository.findAllDisplayPolygraphies(searchPolygraphyResolver.getLimitPolygraphies());
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find all display polygraphies. ");
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query) throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findPolygraphies(query);
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find polygraphies. ");
        }
    }

    public PolygraphyFullModel findPolygraphy(int id) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findDisplayPolygraphy(id);
            PolygraphyFullModel models = new PolygraphyFullModel(polygraphyContacts.getId(), polygraphyContacts.getName(),
                    polygraphyContacts.getAddress(), polygraphyContacts.getPhone(), polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(),
                    polygraphyContacts.getInfo());
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find all polygraphy. ");
        }
    }

    public void removePolygraphy(int polygraphyId) throws ServiceException {
        TransactionStatus status = null;
        try {
            status = txManager.getTransaction(customTx);
            polygraphyServicesRepository.removePolygraphyPaymentMethods(polygraphyId);
            polygraphyServicesRepository.removePolygraphyDeliveryMethods(polygraphyId);
            polygraphyServicesRepository.removePolygraphyServices(polygraphyId);

            polygraphyContactRepository.removePolygraphyContacts(polygraphyId);

            Integer userId = polygraphyRepository.getUserIdByPolygraphyId(polygraphyId);

            polygraphyRepository.removePolygraphy(polygraphyId);

            if (userId != null)
                userRepository.removeUser(userId);
            txManager.commit(status);
        } catch (RepositoryException e) {
            if (status != null) {
                txManager.rollback(status);
                LOG.info("Rollback done.");
            }
            throw new ServiceException("Can not remove all polygraphies. ");
        }
    }
}
