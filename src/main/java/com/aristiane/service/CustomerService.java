package com.aristiane.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.liquor.model.Customer;
import com.aristiane.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
private CustomerRepository customerRepository;
	
	
	public Customer save(Customer customer){
				
		this.customerRepository.save(customer);
				
		
		return customer;
		
	}


}
