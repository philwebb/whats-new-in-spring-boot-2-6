package com.example.myproject;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class NameService {

	private final GreetingService greetingService;

	public NameService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String capitalize(String string) {
		return StringUtils.capitalize(string);
	}

	public String greet(String name) {
		return this.greetingService.greet(name);
	}

}
