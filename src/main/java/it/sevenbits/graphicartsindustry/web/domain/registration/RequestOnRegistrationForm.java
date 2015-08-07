package it.sevenbits.graphicartsindustry.web.domain.registration;

import java.util.Map;

public class RequestOnRegistrationForm {
    private String email;
    private Map<String, String> errors;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
