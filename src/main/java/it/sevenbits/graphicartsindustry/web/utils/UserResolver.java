package it.sevenbits.graphicartsindustry.web.utils;

import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserResolver {

        public String getUserRole() {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth == null) {
                return Role.ROLE_ANONIMOUS.getName();
            }

            return ((GrantedAuthority)(auth.getAuthorities().toArray()[0])).getAuthority();
        }

        public Boolean isUserInRole(String roleName) {
            return getUserRole().equals(roleName);
        }

        public String getUsername() {
            if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof User) {

                return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
            }
            return null;
        }

    }
