package it.sevenbits.graphicartsindustry.web.view.response;

import java.util.HashMap;
import java.util.Map;

public class JsonResponse {
    private Boolean success;
    private Map<String, String> errors;
    private HashMap<String, Object> data;

    public JsonResponse() {
        data = new HashMap<String, Object>();
        errors = new HashMap<String, String>();
    }

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public void addErrors(String key, String value) {
        this.errors.put(key, value);
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public void addData(String key, Object value) {
        this.data.put(key, value);
    }
}
