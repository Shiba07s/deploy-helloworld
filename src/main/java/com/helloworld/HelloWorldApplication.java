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
		//return "welcome to LD Tech ..!!!";
		return "https://www.google.com/search?q=welcome+page&rlz=1C1CHBF_enIN1046IN1046&oq=welcome+page&aqs=chrome.0.0i433i512j0i512l9.5223j0j7&sourceid=chrome&ie=UTF-8#vhid=RsuozKMYb_Mj7M&vssid=l"
	}
	 
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
