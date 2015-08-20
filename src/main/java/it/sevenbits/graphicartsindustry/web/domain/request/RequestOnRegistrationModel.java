package it.sevenbits.graphicartsindustry.web.domain.request;

public class RequestOnRegistrationModel {
    private int id;
    private String email;
    private String hash;
    private String link;

    public RequestOnRegistrationModel() {
    }

    public RequestOnRegistrationModel(int id, String email, String hash) {
        this.id = id;
        this.email = email;
        this.hash = hash;
        this.link = "http://polygraphy.7bits.it/registration?id=" + hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
        this.setLink("http://polygraphy.7bits.it/registration?id=" + hash);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
