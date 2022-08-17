package com.aristiane.liquor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.liquor.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}