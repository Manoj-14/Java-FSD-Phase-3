package com.examples.S05SpringJDBC;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJDBC.dao.EmployeeDAO;
import com.examples.S05SpringJDBC.dao.EmployeeImpl;
import com.examples.S05SpringJDBC.entity.Employee;

public class App {
	public static void main(String[] args) {
		jdbcReadAll();
	}

	private static void jdbcReadAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");
		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeedao");
		List<Employee> employees = edao.read();
		for(Employee emp:employees) {
			System.out.println(emp);
		}

	}

	private static void jdbcReadOne() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");
		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeedao");
		Employee employee = edao.read(1);
		System.out.println(employee);
	}

	private static void jdbcDelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");
		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeedao");
		int res = edao.delete(3);
		System.out.println("Number of records deleted: " + res);
	}

	private static void jdbcUpdate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");
		Employee emp = new Employee(1, "Tom", 21);
		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeedao");
		int res = edao.update(emp);
		System.out.println("Number of records updated: " + res);

	}

	private static void jdbcInsertion() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");
		Employee emp = new Employee(3, "Jerry", 22);
		EmployeeDAO edao = (EmployeeDAO) context.getBean("employeedao");
		int res = edao.create(emp);
		System.out.println("Number of records inserted: " + res);
	}

	private static void directInsertion() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbctemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, 21, "Mohan", 21);
		System.out.println("Number of records inserted: " + result);
	}
}
