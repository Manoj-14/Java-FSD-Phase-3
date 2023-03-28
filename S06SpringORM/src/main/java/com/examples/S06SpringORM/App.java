package com.examples.S06SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORM.dao.ProductDAO;
import com.examples.S06SpringORM.entity.Product;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORM/springconfig.xml");
		ProductDAO pdao = (ProductDAO) context.getBean("productdao");
		Product product = new Product("hp", "Laptop", 12000);
		int res = pdao.create(product);
		System.out.println("Product created: "+res);
	}
}
