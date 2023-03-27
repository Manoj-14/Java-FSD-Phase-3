package com.examples.S03Stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S03Stereotypes.beans.Instructor;

public class App {
	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S03Stereotypes/springconfig.xml");
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);
	}
}
