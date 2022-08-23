package com.aristiane.liquor.service;

import java.util.List;

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

	public List<Seller> findAll() {

		return (List<Seller>) this.sellerRepository.findAll();

	}

	public void delete(long id) {
		this.sellerRepository.deleteById(id);

	}
}
