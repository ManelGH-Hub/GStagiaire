package com.PFE.GStagiaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GStagiaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(GStagiaireApplication.class, args);
    }

}
