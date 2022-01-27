package com.example.myproject;

import org.springframework.stereotype.Service;

@Service
public class NameService implements Capitalizer {

	private final GreetingService greetingService;

	public NameService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@Override
	public String capitalize(String string) {
		char[] chars = string.toCharArray();
		chars[0] = Character.toUpperCase(chars[0]);
		return new String(chars);
	}

	public String greet(String name) {
		return this.greetingService.greet(name);
	}

}
