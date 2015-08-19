package it.sevenbits.graphicartsindustry.web.domain;

import java.util.List;

public class PolygraphyForm {
    private int polygraphyId;
    private String email;
    private String password;
    private String name;
    private String address;
    private String phone;
    private String publicEmail;
    private String website;
    private String info;
    private Boolean orderByEmail;
    private List<Integer> paymentMethods;
    private Boolean writesTheCheck;
    private List<Integer> deliveryMethods;
    private List<Integer> services;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPublicEmail() {
        return publicEmail;
    }

    public void setPublicEmail(String publicEmail) {
        this.publicEmail = publicEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

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
