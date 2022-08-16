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

import com.aristiane.liquor.model.Customer;
import com.aristiane.liquor.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping
	public Customer save(@RequestBody Customer customer) {

		this.service.save(customer);

		return customer;

	}
	
	@GetMapping
	public List<Customer> findAll(){
		
		return this.service.findAll();
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		
		this.service.delete(id);
	}
	
	

}
