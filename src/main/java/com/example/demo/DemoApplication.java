package com.example.demo;


import javafx.application.Application;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Application.class);

    public static void main (String[]args){

        SpringApplication.run(Application.class);
    }


}
