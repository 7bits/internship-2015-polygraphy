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

//class SuccessResponse {
//    private Map data;
//    private boolean success;
//    public SuccessResponse(Map data) {
//        this.data = data;
//        this.success = true;
//    }
//
//}
//
//class ErrorResponse {
//    private Map messages;
//    private boolean success;
//    public SuccessResponse(Map messages) {
//        this.messages = messages;
//        this.success = false;
//    }
//}
