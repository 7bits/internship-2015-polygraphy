package it.sevenbits.graphicartsindustry.web.domain.search;

import java.util.List;

public class SearchForm {

    private String query;
    private List<Integer> services_id;
    private int paymentMethod;
    private int deliveryMethod;
    private boolean writesTheCheck;
    private boolean orderByEmail;

    public SearchForm(String query, List<Integer> services, int paymentMethod, int deliveryMethod,
                      boolean writesTheCheck, boolean orderByEmail) {
        this.query = query;
        this.services_id = services;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
        this.writesTheCheck = writesTheCheck;
        this.orderByEmail = orderByEmail;
    }

    public SearchForm() {}

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Integer> getServices_id() {
        return services_id;
    }

    public void setServices_id(List<Integer> services_id) {
        this.services_id = services_id;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(int deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public boolean isWritesTheCheck() {
        return writesTheCheck;
    }

    public void setWritesTheCheck(boolean writesTheCheck) {
        this.writesTheCheck = writesTheCheck;
    }

    public boolean isOrderByEmail() {
        return orderByEmail;
    }

    public void setOrderByEmail(boolean orderByEmail) {
        this.orderByEmail = orderByEmail;
    }
}
