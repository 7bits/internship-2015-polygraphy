package it.sevenbits.graphicartsindustry.config;


import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfiguration {

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {

        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                ErrorPage error403Page = new ErrorPage(HttpStatus.FORBIDDEN, "/not_found.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/not_found.html");
                ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/not_found.html");

                container.addErrorPages(error403Page, error404Page, error500Page);
            }
        };
    }
}
