package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.repository.RequestOnRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private RequestOnRegistrationRepository requestOnRegistrationRepository;

    public void removeRequestOnRegistration(int requestId) throws ServiceException {
        try {
            requestOnRegistrationRepository.removeRequestOnRegistration(requestId);
        } catch (Exception e) {
            throw new ServiceException("An error occurred while removing request on registration");
        }
    }


}
