package com.quinnox.admin.IMDBAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ImdbAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbAdminApplication.class, args);
		System.err.println("Application started successfully...");
	}

}
