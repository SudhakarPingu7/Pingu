package com.bikedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikedetails.entity.BikeDetails;
import com.bikedetails.service.BikeDetailsService;

@RestController
public class BikeDetailsController {
	@Autowired
	BikeDetailsService bds;
	@PostMapping("/addval")
	public String ad(@RequestBody List<BikeDetails> b) {
	return bds.ad(b);
	

}
}
