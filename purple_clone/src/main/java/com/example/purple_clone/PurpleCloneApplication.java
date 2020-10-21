package com.example.purple_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PurpleCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurpleCloneApplication.class, args);
    }

}
