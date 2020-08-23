package com.manipal.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.manipal.demo.dao.BookingDao;
import com.manipal.demo.model.Booking;
import com.manipal.demo.service.*;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingDao;



	public Iterable<Booking> displayAllBooking() {

		return bookingDao.findAll();
	}


	public ResponseEntity<?> findBookingById(String bookingId) {
		Optional<Booking> findById = bookingDao.findById(bookingId);

		Booking findBooking = findById.get();
		return new ResponseEntity<Booking>(findBooking, HttpStatus.OK);	
	}


	public void createBooking(Booking newBooking) {

	}


	public ResponseEntity<?> findBookingById(int bookingId) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteBooking(int bookingId) {
		// TODO Auto-generated method stub

	}
}

