package it.sevenbits.graphicartsindustry.config;

import it.sevenbits.graphicartsindustry.web.utils.RegistrationLinkResolver;
import it.sevenbits.graphicartsindustry.web.utils.SearchPolygraphyResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnviromentConfiguration {
    @Value("${spring.domain}")
    private String domain;
    @Value("${registration_link.length}")
    private Integer length;
    @Value("${registration_link.basis_for_hash}")
    private String basisForHash;

    @Value("${search_polygraphy.limit_polygraphies}")
    private Integer limitPolygraphies;
    @Value("${search_polygraphy.limit_services}")
    private Integer limitServices;

    @Bean
    public RegistrationLinkResolver registrationLinkResolver() {
        RegistrationLinkResolver registrationLinkResolver = new RegistrationLinkResolver();
        registrationLinkResolver.setDomain(domain);
        registrationLinkResolver.setLength(length);
        registrationLinkResolver.setBasisForHash(basisForHash);
        return registrationLinkResolver;
    }

    @Bean
    public SearchPolygraphyResolver searchPolygraphyResolver() {
        SearchPolygraphyResolver searchPolygraphyResolver = new SearchPolygraphyResolver();
        searchPolygraphyResolver.setLimitPolygraphies(limitPolygraphies);
        searchPolygraphyResolver.setLimitServices(limitServices);
        return searchPolygraphyResolver;
    }
}
