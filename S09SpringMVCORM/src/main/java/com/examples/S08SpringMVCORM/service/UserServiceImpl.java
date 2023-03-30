package com.examples.S08SpringMVCORM.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpringMVCORM.dao.UserDAO;
import com.examples.S08SpringMVCORM.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public int save(User user) {
		return userDAO.create(user);
	}
}
