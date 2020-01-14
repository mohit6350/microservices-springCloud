package com.quinnox.admin.IMDBAdmin.serviceImpl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.quinnox.admin.IMDBAdmin.model.UserMovie;
import com.quinnox.admin.IMDBAdmin.service.UserMovieService;

@Component
public class UserMovieServiceImpl implements UserMovieService {

	@Autowired
	private RestTemplate template;

	@Override
	public String findAllData() {
		String movieData = fetchMovieData("http://Movie-Service/rest/movie/findAll/");
		String userData = fetchUserData("http://user-service/rest/user/findAll");
		return new StringBuilder().append(movieData).append(userData).toString();
	}
	
	public String fetchMovieData(String url){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		return template.getForObject(url, String.class);
		/*return template.exchange(url, HttpMethod.GET, entity, String.class)
				.getBody();*/
	}
	
	public String fetchUserData(String url){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return template.getForObject(url, String.class);
		/*return template.exchange(url, HttpMethod.GET, entity, String.class)
				.getBody();*/
	}
}
