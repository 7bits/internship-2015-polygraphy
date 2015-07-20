package it.sevenbits.graphicartsindustry.web.domain;

public class SearchForm {

    private String query;
    private int serviceId;
    private String paymentMethod;
    private String delivery;
    private boolean writesTheCheck;
    private boolean orderByEmail;

    public String getQuery() {
        return query;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getDelivery() {

        return delivery;
    }

    public boolean getWritesTheCheck() {
        return writesTheCheck;
    }

    public boolean getOrderByEmail() {
        return orderByEmail;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setWritesTheCheck(boolean writesTheCheck) {
        this.writesTheCheck = writesTheCheck;
    }

    public void setOrderByEmail(boolean orderByEmail) {
        this.orderByEmail = orderByEmail;
    }

}
