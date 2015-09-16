package it.sevenbits.graphicartsindustry.web.domain.response;

import java.util.Map;

public class SuccessErrorsResponse {
    private Map<String, String> errors;
    private boolean success;

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
