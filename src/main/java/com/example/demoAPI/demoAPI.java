package com.example.demoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class demoAPI {

    public static void main(String[] args) {
        SpringApplication.run(demoAPI.class, args);
    }

}
