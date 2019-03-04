package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerbController
{

	@Value("${greeting")
	public String greet()
	{
		return "greet";
	}
	@GetMapping("/word")
	public String getword()
	{
		return "kuchbhi";	
	}
}
