package it.sevenbits.graphicartsindustry.web.domain.content;

public class PaymentMethodModel {
    private int id;
    private String name;

    public PaymentMethodModel() {
    }

    public PaymentMethodModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
