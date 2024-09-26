package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //print statement
        System.out.println("Starting the Spring Boot application...");
        SpringApplication.run(Main.class, args);
    }
}
