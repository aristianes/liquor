package com.aristiane.liquor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.liquor.model.Employee;
import com.aristiane.liquor.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository EmployeeRepository;
	
	public Employee save(Employee employee) {

		this.EmployeeRepository.save(employee);

		return employee;

	}

	
}
