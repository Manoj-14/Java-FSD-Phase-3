package com.examples.S04InterfaceInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.S04InterfaceInjection.dao.OrderDAO;

@Component("orderservice")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	@Qualifier("orderdaomysql")
	private OrderDAO orderDAO;
	
	@Override
	public void placeorder() {
		System.out.println("Perform business logic");
		System.out.println("Ready to create object");
		orderDAO.createOrder();
	}

}
