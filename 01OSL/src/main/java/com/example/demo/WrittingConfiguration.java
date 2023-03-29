package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrittingConfiguration {

	@Bean(initMethod = "init", destroyMethod = "destroyed")
	public PlainSimplelogic plainSimplelogic() {
		return new PlainSimplelogic();
	}
}
