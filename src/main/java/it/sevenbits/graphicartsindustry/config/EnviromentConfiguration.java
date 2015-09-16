package it.sevenbits.graphicartsindustry.config;

import it.sevenbits.graphicartsindustry.web.utils.RegistrationLinkResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnviromentConfiguration {
    @Value("${spring.domain}")
    private String domain;
    @Value("${registration_link.min_number}")
    private Integer minNumber;
    @Value("${registration_link.max_number}")
    private Integer maxNumber;

    @Bean
    public RegistrationLinkResolver urlResolver() {
        RegistrationLinkResolver registrationLinkResolver = new RegistrationLinkResolver();
        registrationLinkResolver.setDomain(domain);
        registrationLinkResolver.setMinNumber(minNumber);
        registrationLinkResolver.setMaxNumber(maxNumber);
        return registrationLinkResolver;
    }
}
