package com.examples.S06SpringORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.examples.S06SpringORM.entity.Product;

@Component("productdao")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer res = (Integer) hibernateTemplate.save(product);
		return res;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Transactional
	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public Product find(int id) {
		Product product = (Product) hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		return hibernateTemplate.loadAll(Product.class);
	}

}
