package com.quinnox.admin.IMDBAdmin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@Component
public class AdminConfig {

	@Bean
	@LoadBalanced
	public RestTemplate getTemplate(){
		RestTemplate template = new RestTemplate();
		template.setRequestFactory( new HttpComponentsClientHttpRequestFactory());
		return template;
	}
	
}
