package it.sevenbits.graphicartsindustry.web.domain.response;

public class RemovingRequestOnRegistrationResponse {
    private boolean success;
    private int requestId;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
}
