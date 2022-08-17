package com.aristiane.liquor.repository;

import org.springframework.data.repository.CrudRepository;

import com.aristiane.liquor.model.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
