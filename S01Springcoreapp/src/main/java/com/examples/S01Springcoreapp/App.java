package com.examples.S01Springcoreapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/examples/S01Springcoreapp/springconfig.xml");
		ShoppingCart sc = (ShoppingCart) context.getBean("sc1");
		System.out.println(sc);
	}
}
