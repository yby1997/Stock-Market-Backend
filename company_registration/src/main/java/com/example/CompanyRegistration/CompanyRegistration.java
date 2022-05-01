package com.example.CompanyRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CompanyRegistration {

	public static void main(String[] args) {
		SpringApplication.run(CompanyRegistration.class, args);
	}

}
