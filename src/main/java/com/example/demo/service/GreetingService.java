package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
	
	private final String message;

	 public GreetingService(String message) {
	        this.message = message;
	    }

	    public String getGreeting() {
	        return "Hello, " + message;
	    }
}
