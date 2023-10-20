package com.bikedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikedetails.entity.BikeDetails;

public interface BikeDetailsRepository extends JpaRepository<BikeDetails, Integer>{

}
