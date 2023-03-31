package com.examples.S01Springcoreapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee)context.getBean("emp2");
		System.out.println(emp2);
		
		Employee emp3 = (Employee)context.getBean("emp3");
		System.out.println(emp3);
		
		Employee emp4 = (Employee)context.getBean("emp4");
		System.out.println(emp4);

	}

}
