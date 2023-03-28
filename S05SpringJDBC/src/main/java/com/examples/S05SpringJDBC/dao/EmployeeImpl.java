package com.examples.S05SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJDBC.entity.Employee;
import com.examples.S05SpringJDBC.rowmapper.EmployeeRowMapper;

@Component("employeedao")
public class EmployeeImpl implements EmployeeDAO {
	
	@Autowired
	public JdbcTemplate jdbctemplate;
	
	@Override
	public int create(Employee employee) {
        String sql ="insert into employee values(?,?,?)";
        int res = jdbctemplate.update(sql,employee.getEid(),employee.getEname(),employee.getAge());
		return res;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set ename=?,age=? where eid = ?" ;
		int res = jdbctemplate.update(sql,employee.getEname(),employee.getAge(),employee.getEid());
		return res;
	}

	@Override
	public int delete(int id) {
		String sql ="delete from employee where eid=?";
		int res = jdbctemplate.update(sql,id);
		return res;
	}

	@Override
	public Employee read(int id) {
		String sql="Select * from employee where eid = ?";
		Employee employee = jdbctemplate.queryForObject(sql,new EmployeeRowMapper(),id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql="Select * from employee ";
		List<Employee> employees = jdbctemplate.query(sql, new EmployeeRowMapper());
		return employees;
	}

}
