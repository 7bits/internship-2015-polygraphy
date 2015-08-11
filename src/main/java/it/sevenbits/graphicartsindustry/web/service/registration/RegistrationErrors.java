package it.sevenbits.graphicartsindustry.web.service.registration;

import java.util.Map;

public class RegistrationErrors {
    private Map<String, String> errors;
    private boolean success;
    private String base;

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

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
