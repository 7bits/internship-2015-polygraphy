package it.sevenbits.graphicartsindustry.web.domain;

import it.sevenbits.graphicartsindustry.web.domain.content.DeliveryMethodModel;
import it.sevenbits.graphicartsindustry.web.domain.content.PaymentMethodModel;
import it.sevenbits.graphicartsindustry.web.domain.content.ServiceModel;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationFirstForm;
import it.sevenbits.graphicartsindustry.web.domain.registration.RegistrationSecondForm;

import java.util.List;
import java.util.Map;

public class RegistrationResponse {
    private List<ServiceModel> services;
    private List<PaymentMethodModel> paymentMethods;
    private List<DeliveryMethodModel> deliveryMethods;
    private Map<String, String> errors;
    private RegistrationFirstForm firstForm;
    private RegistrationSecondForm secondForm;

    public List<ServiceModel> getServices() {
        return services;
    }

    public void setServices(List<ServiceModel> services) {
        this.services = services;
    }

    public List<PaymentMethodModel> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethodModel> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<DeliveryMethodModel> getDeliveryMethods() {
        return deliveryMethods;
    }

    public void setDeliveryMethods(List<DeliveryMethodModel> deliveryMethods) {
        this.deliveryMethods = deliveryMethods;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public RegistrationFirstForm getFirstForm() {
        return firstForm;
    }

    public void setFirstForm(RegistrationFirstForm firstForm) {
        this.firstForm = firstForm;
    }

    public RegistrationSecondForm getSecondForm() {
        return secondForm;
    }

    public void setSecondForm(RegistrationSecondForm secondForm) {
        this.secondForm = secondForm;
    }
}
