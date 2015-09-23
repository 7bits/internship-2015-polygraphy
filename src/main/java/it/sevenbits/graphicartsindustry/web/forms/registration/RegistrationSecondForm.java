package it.sevenbits.graphicartsindustry.web.forms.registration;

import java.util.List;

public class RegistrationSecondForm {
    private Boolean orderByEmail;
    private List<Integer> paymentMethods;
    private Boolean writesTheCheck;
    private List<Integer> deliveryMethods;
    private List<Integer> services;

    public Boolean getOrderByEmail() {
        return orderByEmail;
    }

    public void setOrderByEmail(Boolean orderByEmail) {
        this.orderByEmail = orderByEmail;
    }

    public List<Integer> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<Integer> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Boolean getWritesTheCheck() {
        return writesTheCheck;
    }

    public void setWritesTheCheck(Boolean writesTheCheck) {
        this.writesTheCheck = writesTheCheck;
    }

    public List<Integer> getDeliveryMethods() {
        return deliveryMethods;
    }

    public void setDeliveryMethods(List<Integer> deliveryMethods) {
        this.deliveryMethods = deliveryMethods;
    }

    public List<Integer> getServices() {
        return services;
    }

    public void setServices(List<Integer> services) {
        this.services = services;
    }
}
