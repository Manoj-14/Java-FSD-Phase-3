package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDAOMysql implements OrderDAO{
	@Override
	public void createOrder() {
		System.out.println("Open Connection to mysql");
		System.out.println("Run insert statement to mysql");
		System.out.println("order created in mysql");
	}
}
