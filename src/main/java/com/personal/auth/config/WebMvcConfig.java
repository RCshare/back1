package com.personal.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Autoriser toutes les origines pour les points de terminaison non sensibles
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .maxAge(3600);

                /* Appliquer des restrictions CORS pour les points de terminaison sensibles
                registry.addMapping("/admin/**")
                        .allowedOrigins("http://trusted-domain.com", "http://another-trusted-domain.com")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("header1", "header2", "header3")
                        .allowCredentials(true)
                        .maxAge(3600);
                        */

            }
        };
    }
}
