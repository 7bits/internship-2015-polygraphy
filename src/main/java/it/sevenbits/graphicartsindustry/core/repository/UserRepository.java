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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "userRepository")
public class UserRepository implements UserDetailsService {
    private static final Logger LOG = Logger.getLogger(UserRepository.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            LOG.info("Loading user by username: " + username);
            User userDetails = this.findByUsername(username);
            if (userDetails != null && (userDetails.getRole().equals(Role.ROLE_ADMIN) ||
                    userDetails.getRole().equals(Role.ROLE_POLYGRAPHY))) {
                return userDetails;
            }
        } catch (Exception e) {
            LOG.error("Cant load user by username due to repository error: " + e.getMessage(), e);
            throw new UsernameNotFoundException("User details can not be obtained because of " + e.getMessage(), e);
        }
        LOG.info("Cannot load user by username because there are no user details for this username.");
        throw new UsernameNotFoundException("There are no user details for this username");
    }

    public void save(final User user) throws RepositoryException {
        if (user == null) {
            throw new RepositoryException("Null user received");
        }
        try {
            userMapper.save(user);
        } catch (Exception e) {
            throw new RepositoryException("General database error" + e.getMessage(), e);
        }
    }

    public User findById(final Long id) throws RepositoryException {
        if (id == null) {
            throw new RepositoryException("User id is null");
        }
        return userMapper.findById(id);
    }

    public User findByUsername(final String username) throws RepositoryException {
        if (username == null) {
            throw new RepositoryException("User Name is null");
        }
        try {
            User u = userMapper.findByUsername(username);
            return u;//userMapper.findByUsername(username);
        } catch (Exception e) {
            throw new RepositoryException("General database error " + e.getMessage(), e);
        }
    }

    public User createUser(String email, String password) throws RepositoryException {
        User user = new User();
        user.setEmail(email);
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));
        user.setRole(Role.ROLE_POLYGRAPHY);
        try {
            userMapper.save(user);
        } catch (Exception e) {
            throw new RepositoryException("General database error " + e.getMessage(), e);
        }

        return user;
    }
}
