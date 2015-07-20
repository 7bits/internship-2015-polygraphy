package it.sevenbits.graphicartsindustry.web.domain;

public class DeliveryMethodModel {
    private int id;
    private String name;

    public DeliveryMethodModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
