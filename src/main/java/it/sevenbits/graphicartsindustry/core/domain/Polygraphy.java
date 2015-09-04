package it.sevenbits.graphicartsindustry.core.domain;

public class Polygraphy {
    private Integer id;
    private String name;
    private Boolean check;
    private Boolean order;
    private String info;
    private int userId;

    public Polygraphy(Integer id, String name, Boolean check, Boolean order, String info, int userId) {
        this.id = id;
        this.name = name;
        this.check = check;
        this.order = order;
        this.info = info;
        this.userId = userId;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}