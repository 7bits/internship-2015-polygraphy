package it.sevenbits.graphicartsindustry.config;

import it.sevenbits.graphicartsindustry.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebMvcSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userRepository).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        webSecurity.ignoring().antMatchers(
                "/fonts/**",
                "/images/**",
                "/scripts/**",
                "/stylesheets/**",
                "/vendor/**"
                );
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                    .authorizeRequests()
                    .antMatchers("/", "/search", "/polygraphy/**", "/info-for-polygraphy",
                            "/info-for-polygraphy-success", "/about-project").permitAll()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/admin-polygraphy/**").hasRole("POLYGRAPHY")
                    .antMatchers("/registration**").anonymous()
//                    .anyRequest().denyAll()
                .and()
                    .formLogin()
                    .defaultSuccessUrl("/")
                    .loginPage("/login")
                    .permitAll()

                .and()
                    .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/").permitAll();
    }
}
