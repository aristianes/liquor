package com.aristiane.liquor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.liquor.model.Product;
import com.aristiane.liquor.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public Product save(@RequestBody Product product) {

		this.service.save(product);

		return product;

	}

	@GetMapping
	public List<Product> findAll() {

		return this.service.findAll();

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {

		this.service.delete(id);
	}
}
