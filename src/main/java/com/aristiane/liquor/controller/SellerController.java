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

import com.aristiane.liquor.model.Seller;
import com.aristiane.liquor.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService service;

	@PostMapping
	public Seller save(@RequestBody Seller seller) {

		return this.service.save(seller);
	}

	@GetMapping
	public List<Seller> findAll() {

		return this.service.findAll();

	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		
		this.service.delete(id);
	}
}
