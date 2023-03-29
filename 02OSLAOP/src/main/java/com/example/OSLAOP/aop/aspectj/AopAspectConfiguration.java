package com.example.OSLAOP.aop.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopAspectConfiguration {

	@Bean
	public ExecutionTracerAspect executionTracerAspect() {
		return new ExecutionTracerAspect();
	}
}
