package com.manipal.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.Booking;



@Repository
public interface BookingDao extends CrudRepository<Booking, String> {

}
