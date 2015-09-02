package it.sevenbits.graphicartsindustry.config;

import it.sevenbits.graphicartsindustry.web.utils.UrlResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnviromentConfiguration {
    @Value("${spring.domain}")
    private String domain;

    @Bean
    public UrlResolver urlResolver() {
        UrlResolver urlResolver = new UrlResolver();
        urlResolver.setDomain(domain);
        return urlResolver;
    }
}
