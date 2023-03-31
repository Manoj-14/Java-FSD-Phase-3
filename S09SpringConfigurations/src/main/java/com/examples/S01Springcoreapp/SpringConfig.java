package com.examples.S01Springcoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean  //We can give bean name in @Bean else method name is taken as bean name
	public Employee emp1() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Tom");
		return emp;
	}
	
	@Bean
	public Employee emp2() {
		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Kevin");
		return emp;
	}
	
	@Bean
	public Employee emp3() {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Jerry");
		List<String> departments = new ArrayList<>() ;
		departments.add("HR");
		departments.add("Admin");
		departments.add("Sales");
		emp.setDepartments(departments);
		return emp;
	}
	
	@Bean
	public Employee emp4() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Marry");
		Address address = new Address();
		address.setCity("Mysore");
		address.setPincode(570002);
		emp.setAddress(address);
		return emp;
	}
	
	
	
}
