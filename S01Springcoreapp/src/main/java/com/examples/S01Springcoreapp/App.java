package com.examples.S01Springcoreapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//        Employee emp = new Employee();
//        emp.setId(1);
//        emp.setName("Tom");
//        
//        System.out.println(emp.toString());

		ApplicationContext context = new ClassPathXmlApplicationContext("com/examples/S01Springcoreapp/springconfig.xml");
		Employee emp = context.getBean(Employee.class);
		emp.setId(1);
		emp.setName("Tom");
		System.out.println(emp.toString());
	}
}
