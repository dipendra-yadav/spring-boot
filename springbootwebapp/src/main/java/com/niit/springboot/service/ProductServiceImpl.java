package com.niit.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.springboot.dao.ProductRepository;
import com.niit.springboot.domain.Product;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Iterable<Product> listAllProducts() {

		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {

		return productRepository.findOne(id);

	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

}
