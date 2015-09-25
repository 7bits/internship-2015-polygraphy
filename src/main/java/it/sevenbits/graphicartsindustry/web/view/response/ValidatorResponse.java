package it.sevenbits.graphicartsindustry.web.view.response;

import java.util.HashMap;
import java.util.Map;

public class ValidatorResponse {
    private Map<String, String> errors;
    private boolean success;

    public ValidatorResponse() {
        errors = new HashMap<String, String>();
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public void addErrors(String key, String value) {
        errors.put(key, value);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
