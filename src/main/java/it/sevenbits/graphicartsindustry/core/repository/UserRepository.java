package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.mappers.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "userRepository")
public class UserRepository implements UserDetailsService {

    private static final Logger LOG = Logger.getLogger(UserRepository.class.getName());

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            LOG.info("Loading user by username: " + username);
            User userDetails = this.findUserByUsername(username);
            if (userDetails != null && (userDetails.getRole().equals(Role.ROLE_ADMIN) ||
                    userDetails.getRole().equals(Role.ROLE_POLYGRAPHY))) {
                return userDetails;
            }
        } catch (Exception e) {
            LOG.error("Can not load user by username due to repository error: " + e.getMessage(), e);
            throw new UsernameNotFoundException("An error occurred while retrieving user details " + e.getMessage(), e);
        }
        LOG.info("Can not load user by username because there are no user details for this username ");
        throw new UsernameNotFoundException("There are no user details for this username ");
    }

    public User findUserById(Integer userId) throws RepositoryException {
       if (userId == null) {
           LOG.error("Can not load user by id due to repository error: user id is null");
           throw new RepositoryException("User ID is null");
       }
       try {
           return userMapper.findUserById(userId);
       } catch (Exception e) {
           LOG.error("Can not load user by id due to repository error: " + e.getMessage(), e);
           throw new RepositoryException("An error occurred while retrieving user by id "
                   + e.getMessage(), e);
       }
    }

    public User findUserByUsername(String username) throws RepositoryException {
        if (username == null) {
            LOG.error("Can not load user by username due to repository error: username is null");
            throw new RepositoryException("Username is null");
        }
        try {
            return userMapper.findUserByEmail(username);
        } catch (Exception e) {
            LOG.error("Can not load user by username due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving user by username "
                    + e.getMessage(), e);
        }
    }

    public String findEmailById(Integer userId) throws RepositoryException {
        if (userId == null) {
            LOG.error("Can not load user by id due to repository error: user id is null");
            throw new RepositoryException("User ID is null");
        }
        try {
            return userMapper.findEmailById(userId);
        } catch (Exception e) {
            LOG.error("Can not load user email by id due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while retrieving user email by id "
                    + e.getMessage(), e);
        }
    }

    public void createUser(User user) throws RepositoryException {
        if (user == null) {
            LOG.error("Can not create user due to repository error: user is null");
            throw new RepositoryException("User is null");
        }
        try {
            userMapper.createUser(user);
        } catch (Exception e) {
            LOG.error("Can not create user due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while creating user " + e.getMessage(), e);
        }
    }

    public void editEmail(Integer userId, String email) throws RepositoryException {
        if (userId == null) {
            LOG.error("Can not edit user email due to repository error: user id is null");
            throw new RepositoryException("User ID is null");
        }
        if (email == null) {
            LOG.error("Can not edit user email due to repository error: user email is null");
            throw new RepositoryException("Email is null");
        }
        try {
            userMapper.updateEmail(userId, email);
        } catch (Exception e) {
            LOG.error("Can not edit user email due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing email of user " + e.getMessage(), e);
        }
    }

    public void editPassword(Integer userId, String password) throws RepositoryException {
        if (userId == null) {
            LOG.error("Can not edit user password due to repository error: user id is null");
            throw new RepositoryException("User ID is null");
        }
        if (password == null) {
            LOG.error("Can not edit user password due to repository error: user password is null");
            throw new RepositoryException("Password is null");
        }
        try {
            userMapper.updatePassword(userId, password);
        } catch (Exception e) {
            LOG.error("Can not edit user password due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while editing email of user " + e.getMessage(), e);
        }
    }

    public void removeUser(Integer userId) throws RepositoryException {
        if (userId == null) {
            LOG.error("Can not remove user due to repository error: user id is null");
            throw new RepositoryException("User ID is null");
        }
        try {
            userMapper.deleteUser(userId);
        } catch (Exception e) {
            LOG.error("Can not remove user due to repository error: " + e.getMessage(), e);
            throw new RepositoryException("An error occurred while removing user " + e.getMessage(), e);
        }
    }
}
