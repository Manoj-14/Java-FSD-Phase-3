package com.example.OSLSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // indicate it is spring context and enables auto-configuration and also
						// component scanning
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
