package it.sevenbits.graphicartsindustry.web.domain;

import java.util.HashMap;

public class JsonResponse {
    private Boolean success;
    private HashMap<String, Object> errors;
    private HashMap<String, Object> data;

    public JsonResponse() {
        data = new HashMap<String, Object>();
        errors = new HashMap<String, Object>();
    }

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public HashMap<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(String key, Object value) {
        this.errors.put(key, value);
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(String key, Object value) {
        this.data.put(key, value);
    }
}
