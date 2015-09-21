package it.sevenbits.graphicartsindustry.web.domain.content;

public class DeliveryMethodModel {
    private int id;
    private String name;

    public DeliveryMethodModel() {
    }

    public DeliveryMethodModel(int id, String name) {
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
