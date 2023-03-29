package com.example.OSLAOP.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopApplicationCofiguratioin {

	@Bean
	public TracibleService tracibleService() {
		return new TracibleService();
	}
}
