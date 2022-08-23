package com.aristiane.liquor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.liquor.model.Seller;


@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {

}
