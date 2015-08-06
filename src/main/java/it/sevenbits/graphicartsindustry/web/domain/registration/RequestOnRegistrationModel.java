package it.sevenbits.graphicartsindustry.web.domain.registration;

public class RequestOnRegistrationModel {
    private int id;
    private String email;
    private String hash;

    public RequestOnRegistrationModel(int id, String email, String hash) {
        this.id = id;
        this.email = email;
        this.hash = hash;
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
    }
}
