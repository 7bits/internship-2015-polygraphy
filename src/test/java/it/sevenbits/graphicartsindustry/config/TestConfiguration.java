//package it.sevenbits.graphicartsindustry.config;
//
//import it.sevenbits.graphicartsindustry.utils.TestResolver;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class TestConfiguration {
//
//    @Value("${spring.username}")
//    private String username;
//    @Value("${spring.password}")
//    private String password;
//    @Value("${spring.domain}")
//    private String domain;
//    @Value("${spring.driver.chrome}")
//    private String chromeDriver;
//    @Value("${spring.driver.opera}")
//    private String operaDriver;
//    @Value("${spring.driver.safari}")
//    private String safariDriver;
//    @Value("${spring.driver.ie}")
//    private String iEDriver;
//
//    @Bean
//    public TestResolver testResolver() {
//        TestResolver testResolver = new TestResolver();
//        testResolver.setUsername(username);
//        testResolver.setPassword(password);
//        testResolver.setDomain(domain);
//        testResolver.setChromeDriver(chromeDriver);
//        testResolver.setOperaDriver(operaDriver);
//        testResolver.setSafariDriver(safariDriver);
//        testResolver.setIEDriver(iEDriver);
//        return testResolver;
//    }
//}
