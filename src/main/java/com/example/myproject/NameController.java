package com.example.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	
	private final NameService nameService;

	NameController(NameService controllerServices) {
		this.nameService = controllerServices;
	}

	@GetMapping("capitalize/{name}")
	String capitalize(@PathVariable String name) {
		return nameService.capitalize(name);
	}

	@GetMapping("greet/{name}/{name}")
	String greet(@PathVariable String name) {
		return nameService.greet(name);
	}
	
}
