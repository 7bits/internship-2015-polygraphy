package it.sevenbits.graphicartsindustry.web.domain.content;

public class ServiceModel {
    private int id;
    private String name;

    public ServiceModel() {
    }

    public ServiceModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() { return name; }
}
