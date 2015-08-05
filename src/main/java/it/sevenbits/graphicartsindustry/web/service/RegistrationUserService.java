package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationUserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationUserService {

    @Autowired
    private UserRepository repository;

    public void register(RegistrationUserForm form) throws ServiceException {
        try {
            User user = repository.createUser(form.getEmail(), form.getPassword());
        } catch (Exception e) {
            throw new ServiceException("Can't create user: " + e.getMessage(), e);
        }
    }
}
