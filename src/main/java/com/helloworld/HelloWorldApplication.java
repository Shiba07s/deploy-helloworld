package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to LD Tech ..!!!";
		
	}
	 
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
