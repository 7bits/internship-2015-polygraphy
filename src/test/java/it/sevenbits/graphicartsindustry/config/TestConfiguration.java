package it.sevenbits.graphicartsindustry.config;

import it.sevenbits.graphicartsindustry.utils.TestResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Value("${spring.username}")
    private String username;
    @Value("${spring.password}")
    private String password;
    @Value("${spring.domain}")
    private String domain;

    @Bean
    public TestResolver testResolver() {
        TestResolver testResolver = new TestResolver();
        testResolver.setUsername(username);
        testResolver.setPassword(password);
        testResolver.setDomain(domain);
        return testResolver;
    }
}
