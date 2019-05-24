package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.example.controller"})
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("==== Hello Spring Boot ====");
		SpringApplication.run(DemoApplication.class, args);
	}

}
