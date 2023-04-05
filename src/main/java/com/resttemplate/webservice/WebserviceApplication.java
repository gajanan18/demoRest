package com.resttemplate.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();

		Class<Object> List;
		List<Object> response = (java.util.List<Object>) restTemplate.getForObject("https://restcountries.com/v3.1/all",Object.class);

		System.out.println(response.get(0));

	}

}
