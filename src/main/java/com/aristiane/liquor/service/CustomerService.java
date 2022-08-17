package com.aristiane.liquor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.liquor.model.Customer;
import com.aristiane.liquor.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer save(Customer customer) {

		this.customerRepository.save(customer);

		return customer;

	}

	public List<Customer> findAll() {

		return (List<Customer>) this.customerRepository.findAll();
	}

	public void delete(long id) {
		this.customerRepository.deleteById(id);

	}

}
