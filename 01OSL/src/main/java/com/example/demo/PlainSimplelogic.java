package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class PlainSimplelogic implements InitializingBean {

	@Autowired
	private Simplelogic simplelogic;

	public PlainSimplelogic(Simplelogic simplelogic) {

		System.out.println("Class was create");
		this.simplelogic = simplelogic;
	}

	public void init() {
		System.out.println("Class Was initailized");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was initalised in after property set");
	}

	public void destroyed() {
		System.out.println("Bean is about to destroyed");
	}

	public void doSomething() {
		simplelogic.doSomething();
	}

}
