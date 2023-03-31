package com.example.S10SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.S10SpringBoot.dao.SomeDAO;

@Component
public class SomeService {

	@Autowired
	SomeDAO someDao;

	public void create() {
		someDao.hello();
	}

}
