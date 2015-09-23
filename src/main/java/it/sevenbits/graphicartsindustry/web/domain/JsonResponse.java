package it.sevenbits.graphicartsindustry.web.domain;

import java.util.HashMap;

public class JsonResponse {
    private Boolean success;
    private HashMap<String, String> error;
    private HashMap<String, Object> data;

    public JsonResponse() {
        data = new HashMap<String, Object>();
        data = null;
        error = new HashMap<String, String>();
        error = null;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public HashMap<String, String> getError() {
        return error;
    }

    public void setError(String key, String value) {
        this.error.put(key, value);
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(String key, Object value) {
        this.data.put(key, value);
    }
}
