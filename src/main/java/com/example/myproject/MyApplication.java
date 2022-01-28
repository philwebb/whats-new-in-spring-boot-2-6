package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.SanitizingFunction;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;

@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
public class MyApplication {

	@Bean
	public SanitizingFunction sanitizingFunction() {
		return data -> (data.getPropertySource().getName()
				.equals(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME))
						? data.withValue("you're never gonna get it")
						: data;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
