package com.aristiane.liquor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.liquor.model.Product;
import com.aristiane.liquor.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository ProductRepository;

	public Product save(Product product) {

		this.ProductRepository.save(product);

		return product;

	}

	public List<Product> findAll() {

		return (List<Product>) this.ProductRepository.findAll();
	}

}
