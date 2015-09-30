package it.sevenbits.graphicartsindustry.core.domain;

public class RequestOnRegistration {
    private Integer id;
    private String email;
    private String hash;

    public RequestOnRegistration() {
    }

    public RequestOnRegistration(Integer id, String email, String hash) {
        this.id = id;
        this.email = email;
        this.hash = hash;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
