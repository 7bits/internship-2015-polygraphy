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
    private SearchPolygraphyResolver searchPolygraphyResolver;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolygraphyRepository polygraphyRepository;

    @Autowired
    private PolygraphyContactRepository polygraphyContactRepository;

    @Autowired
    private PolygraphyServicesRepository polygraphyServicesRepository;

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
            throw new ServiceException("Can not find all polygraphies. ");
        }
    }

    public List<PolygraphyMinModel> findPolygraphies(SearchForm query) throws ServiceException {
        try {
            List<PolygraphyContacts> polygraphies = polygraphyRepository.findPolygraphies(query.getQuery(),
                    query.getServices(), query.getPaymentMethod(), query.isWritesTheCheck(), query.getDeliveryMethod(),
                    query.isOrderByEmail());
            List<PolygraphyMinModel> models = new ArrayList<>(polygraphies.size());
            for (PolygraphyContacts p: polygraphies) {
                models.add(new PolygraphyMinModel(p.getId(), p.getName(), p.getAddress(), p.getPhone()));
            }
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find polygraphies. ");
        }
    }

    public PolygraphyFullModel findPolygraphy(Integer polygraphyId) throws ServiceException {
        try {
            PolygraphyContacts polygraphyContacts = polygraphyRepository.findDisplayPolygraphy(polygraphyId);
            PolygraphyFullModel models = new PolygraphyFullModel(polygraphyContacts.getId(), polygraphyContacts.getName(),
                    polygraphyContacts.getAddress(), polygraphyContacts.getPhone(), polygraphyContacts.getEmail(), polygraphyContacts.getWebsite(),
                    polygraphyContacts.getInfo());
            return models;
        } catch (RepositoryException e) {
            throw new ServiceException("Can not find full info about polygraphy. ");
        }
    }

    public void removePolygraphy(Integer polygraphyId) throws ServiceException {
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
