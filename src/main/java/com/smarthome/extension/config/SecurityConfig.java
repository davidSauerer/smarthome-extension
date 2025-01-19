package com.smarthome.extension.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Bean
    public SecurityFilterChain web(HttpSecurity http) throws Exception {
        http
                .cors(cors -> cors.disable())
                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest().permitAll()
                );

        return http.build();
    }

}

