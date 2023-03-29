package com.example.OSLAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.OSLAOP.aop.TracibleService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		ConfigurableApplicationContext context = app.run(args);

		context.getBean(TracibleService.class).hello("aop");

	}

}
