package com.example.ispit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HciispitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HciispitApplication.class, args);
	}
@GetMapping
	public String hello(){
		return  "Helloo";
	}
}
