package com.aristiane.liquor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.liquor.model.Seller;
import com.aristiane.liquor.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	public Seller save(Seller seller) {

		this.sellerRepository.save(seller);

		return seller;

	}

}
