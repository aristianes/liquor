package com.aristiane.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.liquor.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
