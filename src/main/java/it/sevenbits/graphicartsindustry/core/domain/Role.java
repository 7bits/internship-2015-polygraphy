package it.sevenbits.graphicartsindustry.core.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ADMIN (0, "Admin"),
    ROLE_POLYGRAPHY (1, "Polygraphy"),
    ROLE_ANONIMOUS (2, "Anonymous");

    private Integer order;
    private String description;

    Role() {
        this(null, null);
    }

    Role(Integer order, String description) {
        this.order = order;
        this.description = description;
    }

    @Override
    public String getAuthority() {
        return this.name();
    }

    public String getName() {
        return this.name();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name();
    }
}