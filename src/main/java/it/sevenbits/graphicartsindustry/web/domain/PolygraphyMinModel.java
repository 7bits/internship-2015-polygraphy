package it.sevenbits.graphicartsindustry.web.domain;

public class PolygraphyMinModel {
    private int id;
    private String name;
    private String addres;
    private String phone;

    public PolygraphyMinModel(int id, String name, String addres, String phone) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

