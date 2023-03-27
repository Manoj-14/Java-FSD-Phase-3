package com.examples.S01Springcoreapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		demo2();
		
	}
	
	
	private static void demo2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/examples/S01Springcoreapp/springconfig2.xml");
		
		Car c1 =(Car)context.getBean("car1");
		System.out.println(c1.hashCode());
		
		Car c2 =(Car)context.getBean("car1");
		System.out.println(c2.hashCode());
		
		Bank b1 = (Bank)context.getBean("bank1");
		System.out.println(b1.hashCode());
		
		Bank b2 = (Bank)context.getBean("bank1");
		System.out.println(b2.hashCode());
		
		
	}

	private static void demo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/examples/S01Springcoreapp/springconfig.xml");
		ShoppingCart sc = (ShoppingCart) context.getBean("sc1");
		System.out.println(sc);
	}
}
