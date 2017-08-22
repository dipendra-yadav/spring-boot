package com.niit.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.niit.springboot.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
