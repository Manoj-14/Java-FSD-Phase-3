package com.examples.S07SpringMVC.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVC.model.Employee;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("id", 123);
		modelView.addObject("name", "Manoj");
		modelView.addObject("salary", 15000);
		modelView.setViewName("hello");
		return modelView;
	}

	@RequestMapping("/employee")
	public ModelAndView readEmployee() {
		ModelAndView modelView = new ModelAndView();
		Employee employee = new Employee(1, "Manoj", 20000);
		modelView.addObject("employee", employee);
		modelView.setViewName("employee");
		return modelView;
	}

	@RequestMapping("/employees")
	public ModelAndView readEmployees() {
		ModelAndView modelView = new ModelAndView();
		Employee employee1 = new Employee(1, "Manoj", 20000);
		Employee employee2 = new Employee(2, "Mohan", 20000);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		modelView.addObject("employee", employees);
		modelView.setViewName("employee");
		return modelView;
	}

	@RequestMapping("/showdata")
	public ModelAndView showdata(@RequestParam("id") int id, @RequestParam("name") String name) {
		System.out.println("Id" + id);
		System.out.println("Name" + name);

		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);

		mv.setViewName("showdata");
		return mv;
	}
}