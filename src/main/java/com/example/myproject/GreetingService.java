package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	private final GreetingProperties properties;

	@Autowired
	private Capitalizer capitalizer;

	GreetingService(GreetingProperties properties) {
		this.properties = properties;
	}

	public String greet(String name) {
		return String.format("%s %s", properties.salutation(), capitalizer.capitalize(name));
	}

}
