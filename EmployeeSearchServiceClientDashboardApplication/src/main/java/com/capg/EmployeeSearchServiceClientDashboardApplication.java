package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EmployeeSearchServiceClientDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSearchServiceClientDashboardApplication.class, args);
	}

}
