package com.myLearning.SimpleWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication marks this as the main Spring Boot class
// Reason: It enables auto-configuration, component scanning,
// and starts the Spring Boot application
public class SimpleWebAppApplication {

    public static void main(String[] args) {
        // Starts the Spring Boot application
        SpringApplication.run(SimpleWebAppApplication.class, args);
    }
}
