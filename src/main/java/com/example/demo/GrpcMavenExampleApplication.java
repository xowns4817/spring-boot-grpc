package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GrpcMavenExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcMavenExampleApplication.class, args);
	}

	@GetMapping("/test")
	public String test( ) {
		return "test";
	};
}
