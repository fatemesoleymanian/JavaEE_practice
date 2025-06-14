package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);
        Dev dev = context.getBean(Dev.class);
        dev.build();
    }

}
