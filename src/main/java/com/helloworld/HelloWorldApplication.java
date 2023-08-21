package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	
	public String getMessage() {
		return "welcome to LD Tech";
		
	}
	 
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
