package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RegisterAndLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterAndLoginApplication.class, args);
		System.out.println("Welcome..!");
	}
	
	// 1.Controller --> 2.Entity --> 3.DTO  --> 
	// 4.service and Impl --> 5.Repo --> 6.config 
	
	// From Service we need to call Repo using autowire.
	// The Record is Coming from DTO and set it into the Entity 
	// and call the Entity to Repo. From Repo we communicate with the database.
}
