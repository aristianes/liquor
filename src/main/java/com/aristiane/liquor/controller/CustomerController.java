package com.aristiane.liquor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.liquor.model.Customer;
import com.aristiane.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping
	public Customer save(@RequestBody Customer customer) {

		this.service.save(customer);

		return customer;

	}

}
