package com.bikedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikedetails.dao.BikeDetailsDao;
import com.bikedetails.entity.BikeDetails;

@Service
public class BikeDetailsService {
	@Autowired
	BikeDetailsDao bdd;
	public String ad(List<BikeDetails> a) {
		return bdd.ad(a);
	}

}
