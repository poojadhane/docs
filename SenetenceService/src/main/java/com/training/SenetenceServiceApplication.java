package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class SenetenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenetenceServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate resttemplate()
	{
		return new RestTemplate();
	}

}
