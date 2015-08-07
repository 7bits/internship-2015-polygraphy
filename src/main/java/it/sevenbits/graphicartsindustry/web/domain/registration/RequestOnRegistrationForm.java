package it.sevenbits.graphicartsindustry.web.domain.registration;

import java.util.Map;

public class RequestOnRegistrationForm {
    private String email;
    private Map<String, String> errors;
    private boolean success;

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

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
