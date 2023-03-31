package com.example.S11SpringDaataJPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringDaataJPA.entity.Product;
import com.example.S11SpringDaataJPA.entity.ProductRepository;

@SpringBootTest
class S11SpringDaataJpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}

	@Test
	void createProduct() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		Product product = new Product("Redme Note 8", "Mobile", 12000);
		pr.save(product);
	}
}
