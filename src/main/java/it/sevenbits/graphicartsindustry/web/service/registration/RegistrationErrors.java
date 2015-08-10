package it.sevenbits.graphicartsindustry.web.service.registration;

import java.util.Map;

public class RegistrationErrors {
    private Map<String, String> errors;
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
