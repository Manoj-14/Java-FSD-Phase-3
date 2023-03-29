package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Simplelogic implements InitializingBean {
	public Simplelogic() {
		System.out.println("Class was create");
	}

	@PostConstruct
	public void init() {
		System.out.println("Class Was initailized");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was initalised in after property set");
	}

	@PreDestroy
	public void destroyed() {
		System.out.println("Bean is about to destroyed");
	}

	public void doSomething() {
		System.out.println("Work from Silmple Logic");
		
	}

}
