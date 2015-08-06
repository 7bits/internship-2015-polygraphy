package it.sevenbits.graphicartsindustry.web.domain.content;


public class PolygraphyFullModel {
    private int id;
    private String name;
    private String addres;
    private String phone;
    private String email;
    private String website;
    private String info;

    public PolygraphyFullModel(int id, String name, String addres, String email, String website, String phone, String info) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.email = email;
        this.website = website;
        this.phone = phone;
        this.info = info;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
