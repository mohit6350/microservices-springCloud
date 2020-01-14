package com.quinnox.user.IMDBUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ImdbUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbUserApplication.class, args);
		System.err.println("Application started successfully...");
	}

}
