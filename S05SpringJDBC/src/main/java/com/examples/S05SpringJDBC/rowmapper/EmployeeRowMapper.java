package com.examples.S05SpringJDBC.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.examples.S05SpringJDBC.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEid(rs.getInt(1));
		employee.setEname(rs.getString(2));
		employee.setAge(rs.getInt(3));
		return employee;
	}
}
