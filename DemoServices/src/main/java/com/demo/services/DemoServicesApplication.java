package com.demo.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.demo","com.demo.persistence.demo"})
@SpringBootApplication
public class DemoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServicesApplication.class, args);
	}
}
