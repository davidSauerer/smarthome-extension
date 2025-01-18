package com.smarthome.extension;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {
    public static void main(String[] args) {
//        System.setProperty("server.servlet.context-path", "/home");
        SpringApplication.run(SpringBootBasicApplication.class, args);
        System.out.println("Application started");
    }
}
