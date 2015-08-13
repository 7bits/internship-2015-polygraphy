package it.sevenbits.graphicartsindustry.web.domain.admin;

public class PolygraphyAdminModel {
    private int id;
    private String name;
    private String email;
    private boolean displayed;

    public PolygraphyAdminModel(int id, String name, String email, boolean displayed) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.displayed = displayed;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDisplayed() {
        return displayed;
    }

    public void setDisplayed(boolean displayed) {
        this.displayed = displayed;
    }
}
