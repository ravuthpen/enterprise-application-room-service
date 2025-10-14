package com.piseth.java.school.roomservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter  corsWebFilter(){

        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:4200");

        //url base
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/**",config);

        return new CorsWebFilter(source);
    }
}
