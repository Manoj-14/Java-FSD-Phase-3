package com.example.S11SpringDaataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringDaataJPA.entity.Product;
import com.example.S11SpringDaataJPA.repository.ProductRepository;

@SpringBootTest
class S11SpringDaataJpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}

//	@Test
	void createProduct() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		Product product1 = new Product("Redme Note 8", "Mobile", 12000);
		Product product2 = new Product("Hp", "Laptop", 12000);
		pr.save(product1);
		pr.save(product2);
	}

//	@Test
	void readProduct() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = pr.findById(8); // optional means it may or may not find it
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		} else {
			System.out.println("Product not found");
		}
	}

//	@Test
	void updateProduct() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = pr.findById(1);
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			product.setName("OnePlus");
			pr.save(product);
			System.out.println(product);
		} else {
			System.out.println("Product not found");
		}
	}

//	@Test
	void readAllProduct() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) pr.findAll();
		if (products.size() > 0) {
			for (Product product : products) {
				System.out.println(product);
			}
		} else {
			System.out.println("product table is emppty");
		}
	}

	@Test
	void readByProductName() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		List<Product> products = pr.findByName("Hp");
		if (products.size() > 0) {
			for (Product product : products) {
				System.out.println(product);
			}
		} else {
			System.out.println("product table is emppty");
		}
	}
}
