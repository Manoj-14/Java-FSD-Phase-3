package com.example.OSLTransactionManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.OSLTransactionManagement.tx.BusinessService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		ConfigurableApplicationContext context = app.run(args);
		
		context.getBean(BusinessService.class).doBusiness();
	}

}
