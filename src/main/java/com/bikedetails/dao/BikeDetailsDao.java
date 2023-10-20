package com.bikedetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bikedetails.entity.BikeDetails;
import com.bikedetails.repository.BikeDetailsRepository;

@Repository
public class BikeDetailsDao {
	@Autowired
	BikeDetailsRepository bdr;
	public String ad(List<BikeDetails> c) {
		 bdr.saveAll(c);
		 System.out.println("welcome");
		 return "saved pingu";
	}

}
