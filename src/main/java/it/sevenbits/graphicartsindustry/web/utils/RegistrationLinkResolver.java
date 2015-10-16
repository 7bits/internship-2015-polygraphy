package it.sevenbits.graphicartsindustry.web.utils;

public class RegistrationLinkResolver {
    private String domain;
    private Integer length;
    private String basisForHash;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getBasisForHash() {
        return basisForHash;
    }

    public void setBasisForHash(String basisForHash) {
        this.basisForHash = basisForHash;
    }
}
