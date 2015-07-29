package it.sevenbits.graphicartsindustry.core.domain;

public class RegistrationLink {
    private String linkBasic;
    private String linkRegistration;
    private String hash;

    public RegistrationLink() {
        this.linkBasic = "";
        this.linkRegistration = "";
        this.hash = "";
    }

    public RegistrationLink(String linkBasic, String linkRegistration, String hash) {
        this.linkBasic = linkBasic;
        this.linkRegistration = linkRegistration;
        this.hash = hash;
    }

    public String getLinkBasic() {
        return linkBasic;
    }

    public void setLinkBasic(String linkBasic) {
        this.linkBasic = linkBasic;
    }

    public String getLinkRegistration() {
        return linkRegistration;
    }

    public void setLinkRegistration(String linkRegistration) {
        this.linkRegistration = linkRegistration;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
