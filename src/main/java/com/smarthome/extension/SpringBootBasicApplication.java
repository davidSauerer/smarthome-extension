package com.smarthome.extension;

import java.util.Arrays;

import com.smarthome.extension.rest.controller.SensorControllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringBootBasicApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
        logger.info("Application started");
    }
}
