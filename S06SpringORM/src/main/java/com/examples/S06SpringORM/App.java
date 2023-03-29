package com.examples.S06SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORM.dao.ProductDAO;
import com.examples.S06SpringORM.entity.Product;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORM/springconfig.xml");
		deletion(context);

	}

	private static void selectAll(ClassPathXmlApplicationContext context) {
		ProductDAO pdao = (ProductDAO) context.getBean("productdao");
		for (Product product : pdao.findAll()) {
			System.out.println(product);
		}

	}

	private static void selection(ClassPathXmlApplicationContext context) {
		ProductDAO pdao = (ProductDAO) context.getBean("productdao");
		Product product = pdao.find(4);
		System.out.println(product);
	}

	private static void deletion(ClassPathXmlApplicationContext context) {
		ProductDAO pdao = (ProductDAO) context.getBean("productdao");
		Product product = new Product();
		product.setId(5);
		pdao.delete(product);
	}

	private static void updation(ClassPathXmlApplicationContext context) {
		ProductDAO pdao = (ProductDAO) context.getBean("productdao");
		Product product = new Product(4, "hp", "Laptop", 45000);
		pdao.update(product);
	}

	private static void inseration(ClassPathXmlApplicationContext context) {
		ProductDAO pdao = (ProductDAO) context.getBean("productdao");
		Product product = new Product("hp", "Laptop", 12000);
		int res = pdao.create(product);
		System.out.println("Product created: " + res);
	}
}
