package com.example.address_project_emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AddressProjectEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressProjectEmpApplication.class, args);
	}

}
