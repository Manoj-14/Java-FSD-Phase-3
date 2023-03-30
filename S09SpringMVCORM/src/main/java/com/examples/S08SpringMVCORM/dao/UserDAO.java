package com.examples.S08SpringMVCORM.dao;

import java.util.List;

import com.examples.S08SpringMVCORM.entity.User;

public interface UserDAO {
	int create(User user);
	List<User> findAll();
	boolean findUser(String email);
}
