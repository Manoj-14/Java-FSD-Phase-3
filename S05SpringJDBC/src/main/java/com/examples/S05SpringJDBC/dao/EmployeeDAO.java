package com.examples.S05SpringJDBC.dao;

import com.examples.S05SpringJDBC.entity.Employee;

public interface EmployeeDAO {
	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
}
