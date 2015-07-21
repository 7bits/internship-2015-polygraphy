package it.sevenbits.graphicartsindustry.web.domain;

public class SearchForm {

    private String query;
    private int serviceId;
    private int paymentMethod;
    private int deliveryMethod;
    private boolean writesTheCheck;
    private boolean orderByEmail;

    public SearchForm(String query, Integer serviceId, Integer paymentMethod, Integer deliveryMethod,
                      Boolean writesTheCheck, Boolean orderByEmail) {
        this.query = query;
        this.serviceId = serviceId;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
        this.writesTheCheck = writesTheCheck;
        this.orderByEmail = orderByEmail;
    }

    public String getQuery() {
        return query;
    }

    public int getServiceId() {
        return serviceId;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public int getDeliveryMethod() {
        return deliveryMethod;
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

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(int delivery) {
        this.deliveryMethod = delivery;
    }

    public void setWritesTheCheck(boolean writesTheCheck) {
        this.writesTheCheck = writesTheCheck;
    }

    public void setOrderByEmail(boolean orderByEmail) {
        this.orderByEmail = orderByEmail;
    }

}
