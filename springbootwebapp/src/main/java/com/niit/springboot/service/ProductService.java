package com.niit.springboot.service;

import com.niit.springboot.domain.Product;

public interface ProductService {
	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);
}
