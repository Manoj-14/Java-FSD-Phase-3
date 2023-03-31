package com.examples.S08SpringMVCORM.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpringMVCORM.dao.UserDAO;
import com.examples.S08SpringMVCORM.entity.User;
import com.examples.S08SpringMVCORM.exception.UserAlreadyExistsException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		
		if(userDAO.findUser(user.getEmail())) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		
		return userDAO.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userDAO.findAll();
	}
}
