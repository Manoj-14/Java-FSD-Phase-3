package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDAOOracleImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Open Connection to oracle db");
		System.out.println("Run insert statement to oracle db");
		System.out.println("order created in oracle db");
	}

}
