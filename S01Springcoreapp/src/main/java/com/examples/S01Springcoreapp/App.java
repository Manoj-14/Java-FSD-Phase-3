package com.examples.S01Springcoreapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/examples/S01Springcoreapp/springconfig.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1.toString());
		
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2.toString());
		
		Employee emp3 = (Employee) context.getBean("emp3");
		System.out.println(emp3.toString());
		
		Employee emp4 = (Employee) context.getBean("emp4");
		System.out.println(emp4.toString());
		
		Employee emp5 = (Employee) context.getBean("emp5");
		System.out.println(emp5.toString());
		
		Employee emp6 = (Employee) context.getBean("emp6");
		System.out.println(emp6.toString());
		
		Employee emp7 = (Employee) context.getBean("emp7");
		System.out.println(emp7.toString());
		
		Employee emp8 = (Employee) context.getBean("emp8");
		System.out.println(emp8.toString());
	}
}
