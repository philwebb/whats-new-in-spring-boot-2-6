package com.example.myproject;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GreetingService {

	private final GreetingProperties properties;

	GreetingService(GreetingProperties properties) {
		this.properties = properties;
	}

	public String greet(String name) {
		return String.format("%s %s", properties.salutation(), StringUtils.capitalize(name));
	}

}
