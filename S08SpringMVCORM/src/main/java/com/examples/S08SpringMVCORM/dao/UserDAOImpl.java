package com.examples.S08SpringMVCORM.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.S08SpringMVCORM.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findAll() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public boolean findUser(String email) {
		List<?> users = hibernateTemplate.find("from User u where u.email = ?0", email);

		if (users.size() > 0)
			return true;

		return false;
	}

}
