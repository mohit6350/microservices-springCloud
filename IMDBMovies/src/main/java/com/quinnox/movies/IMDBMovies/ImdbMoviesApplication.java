package com.quinnox.movies.IMDBMovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ImdbMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbMoviesApplication.class, args);
		System.err.println("Application started successfully...");
	}

}
