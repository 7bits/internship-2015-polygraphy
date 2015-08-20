package it.sevenbits.graphicartsindustry.core.repository;

import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import it.sevenbits.graphicartsindustry.core.mappers.PolygraphyMapper;
import it.sevenbits.graphicartsindustry.core.mappers.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "userRepository")
public class UserRepository implements UserDetailsService {
    private static final Logger LOG = Logger.getLogger(UserRepository.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PolygraphyMapper polygraphyMapper;

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
            LOG.error("Can not load user by username due to repository error " + e.getMessage(), e);
            throw new UsernameNotFoundException("User details can not be obtained because of " + e.getMessage(), e);
        }
        LOG.info("Can not load user by username because there are no user details for this username ");
        throw new UsernameNotFoundException("There are no user details for this username ");
    }


    public User findUserById(int id) throws RepositoryException {
       try {
           return userMapper.findUserById(id);
       } catch (Exception e) {
           throw new RepositoryException("An error occurred while retrieving editing user by id "
                   + e.getMessage(), e);
       }
    }

    public User findUserByUsername(String username) throws RepositoryException {
        if (username == null) {
            throw new RepositoryException("User Name is null");
        }
        try {
            return userMapper.findUserByUsername(username);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving editing user by username "
                    + e.getMessage(), e);
        }
    }

    public User findUserByPolygraphyId(int polygraphyId) throws RepositoryException {
        Integer userId = null;
        try {
            userId = polygraphyMapper.getUserIdByPolygraphyId(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving userId by polygraphyId "
                    + e.getMessage(), e);
        }
        if (userId == null) {
            throw new RepositoryException("UserId is null");
        }
//        if (userId == null) {
//            User user = new User();
//            user.setEmail(null);
//            return user;
//        }
        try {
            return userMapper.findUserById(userId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving user by user id "
                    + e.getMessage(), e);
        }
    }


    public User createUser(String email, String password, Role role) throws RepositoryException {
        User user = new User();
        user.setEmail(email);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));
        user.setRole(role);
        user.setEnabled(true);
        try {
            userMapper.saveUser(user);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while creating user " + e.getMessage(), e);
        }
        return user;
    }

    public void saveUser(User user) throws RepositoryException {
        if (user == null) {
            throw new RepositoryException("Null user received");
        }
        try {
            userMapper.saveUser(user);
        } catch (Exception e) {
            throw new RepositoryException("General database error" + e.getMessage(), e);
        }
    }

    public void saveEditingUser(int polygraphyId, String email, String password) throws RepositoryException {
        Integer userId = null;
        try {
            userId = polygraphyMapper.getUserIdByPolygraphyId(polygraphyId);
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while retrieving userId by polygraphyId "
                    + e.getMessage(), e);
        }
        if (userId == null) {
            throw new RepositoryException("UserId is null");
        }
        try {
            userMapper.updateEmail(userId, email);
            if (password !=null && !password.isEmpty()) {
                PasswordEncoder encoder = new BCryptPasswordEncoder();
                userMapper.updatePassword(userId, encoder.encode(password));
            }
        } catch (Exception e) {
            throw new RepositoryException("An error occurred while saving editing information about user "
                    + e.getMessage(), e);
        }
    }
}
