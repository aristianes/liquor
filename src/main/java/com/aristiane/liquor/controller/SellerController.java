package com.aristiane.liquor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.liquor.service.SellerService;


@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService service;
	
}
