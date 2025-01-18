package com.smarthome.extension.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2) // Specify Swagger 2 for the documentation type
                .select() // Allows you to filter which APIs to include
                .apis(RequestHandlerSelectors.basePackage("com.smarthome.extension.rest.controller")) // Specify the base package where your controllers are
                .paths(PathSelectors.any()) // Include all paths
                .build();
    }


}
