package com.aristiane.liquor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.liquor.model.Store;
import com.aristiane.liquor.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService service;

	@PostMapping
	public Store save(@RequestBody Store store) {

		this.service.save(store);

		return store;

	}

	@GetMapping
	public List<Store> findAll() {

		return this.service.findAll();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {

		this.service.delete(id);
	}
}
