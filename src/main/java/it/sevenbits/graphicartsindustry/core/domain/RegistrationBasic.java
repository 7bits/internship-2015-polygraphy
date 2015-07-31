package it.sevenbits.graphicartsindustry.core.domain;

public class RegistrationBasic {
    private Integer id;
    private String name;
    private Boolean check;
    private Boolean order;

    public RegistrationBasic(Integer id, String name, Boolean check, Boolean order) {
        this.id = id;
        this.name = name;
        this.check = check;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOrder() {
        return order;
    }

    public void setOrder(Boolean order) {
        this.order = order;
    }
}
