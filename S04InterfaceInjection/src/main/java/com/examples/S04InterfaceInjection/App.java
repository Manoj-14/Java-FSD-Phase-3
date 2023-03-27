package com.examples.S04InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S04InterfaceInjection.service.OrderService;


public class App 
{
    public static void main( String[] args )
    {
        demo1();
    }

	private static void demo1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/examples/S04InterfaceInjection/springconfig.xml");
		OrderService orderService = (OrderService) context.getBean("orderservice");
		orderService.placeorder();
	}
}
