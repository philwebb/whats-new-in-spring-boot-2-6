package com.example.myproject;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	private final GreetingProperties properties;

	private final Capitalizer capitalizer;

	GreetingService(GreetingProperties properties, Capitalizer capitalizer) {
		this.properties = properties;
		this.capitalizer = capitalizer;
	}

	public String greet(String name) {
		return String.format("%s %s", properties.salutation(), capitalizer.capitalize(name));
	}

}
