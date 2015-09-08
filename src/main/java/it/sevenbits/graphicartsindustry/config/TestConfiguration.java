package it.sevenbits.graphicartsindustry.config;

import it.sevenbits.graphicartsindustry.web.utils.TestResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Value("test.username")
    private String username;
    @Value("test.password")
    private String password;
    @Value("test.domain")
    private String domain;
    @Value("test.driver.chrome")
    private String chromeDriver;
    @Value("test.driver.opera")
    private String operaDriver;
    @Value("test.driver.safari")
    private String safariDriver;
    @Value("test.driver.ie")
    private String iEDriver;

    @Bean
    public TestResolver testResolver() {
        TestResolver testResolver = new TestResolver();
        testResolver.setUsername(username);
        testResolver.setPassword(password);
        testResolver.setDomain(domain);
        testResolver.setChromeDriver(chromeDriver);
        testResolver.setOperaDriver(operaDriver);
        testResolver.setSafariDriver(safariDriver);
        testResolver.setIEDriver(iEDriver);
        return testResolver;
    }
}
