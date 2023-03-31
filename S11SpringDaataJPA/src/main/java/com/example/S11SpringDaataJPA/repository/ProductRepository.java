package com.example.S11SpringDaataJPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S11SpringDaataJPA.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByName(String name);
}
