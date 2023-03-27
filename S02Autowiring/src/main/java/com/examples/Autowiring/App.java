package com.examples.Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		demo1();
	}
	
	private static void demo1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/examples/Autowiring/springconfig.xml");
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println(emp1);
		Employee emp2 = (Employee)context.getBean("emp2");
		System.out.println(emp2);
	}

}
