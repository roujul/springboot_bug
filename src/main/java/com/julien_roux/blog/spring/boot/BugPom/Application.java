package com.julien_roux.blog.spring.boot.BugPom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    	System.out.println("start...");
    	SpringApplication.run(Application.class, args);
    	System.out.println("end.");
    }
}
