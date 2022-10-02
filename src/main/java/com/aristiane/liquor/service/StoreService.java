package com.aristiane.liquor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.liquor.model.Store;
import com.aristiane.liquor.repository.StoreRepository;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;
	
	public Store save(Store store) {

		this.storeRepository.save(store);

		return store;

	}

}
