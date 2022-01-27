package com.example.myproject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("greeting")
@ConstructorBinding
public record GreetingProperties(String salutation) {

}
