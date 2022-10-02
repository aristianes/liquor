package com.aristiane.liquor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.liquor.model.Store;
import com.aristiane.liquor.service.StoreService;


@RestController
@RequestMapping
public class StoreController {
	
}
	@Autowired
	private StoreService service;

	@PostMapping
	public Store save(@RequestBody Store store){

		this.service.save(store);

		return store;

		
}
