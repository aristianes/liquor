package com.aristiane.liquor.service;

import java.util.List;

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

	public List<Employee> findAll() {

		return (List<Employee>) this.EmployeeRepository.findAll();
	}

	public void delete(long id) {
		this.EmployeeRepository.deleteById(id);

	}
}
