package com.aristiane.liquor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.liquor.model.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long>{
	

	
}
