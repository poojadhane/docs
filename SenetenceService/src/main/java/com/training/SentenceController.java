package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class SentenceController 
{
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/sentence")
	@HystrixCommand(fallbackMethod="fallbacksentence")
	
	public String getsentence()
	{
		String verbServiceData = restTemplate.getForObject("http://verb/word", String.class);
		String sentenceData = "Sentence Service calls Verb Service : " + verbServiceData;
		return sentenceData;
	}

	public String fallbacksentence()    
	{
		return "fallback method executed";
	}
}
