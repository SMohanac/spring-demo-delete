package com.manipal.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.manipal.demo.model.Booking;
import com.manipal.demo.service.BookingService;


public class BookingController {

	@Autowired
	BookingService bookingService;

	/*@PostMapping("/createBooking")
	public void addBooking(@RequestBody Booking newBooking) {

		bookingService.createBooking(newBooking);
	}*/

	@GetMapping("/readAllBooking")
	public Iterable<Booking> readAllBookings() {

		return bookingService.displayAllBooking();
	}


	@GetMapping("/searchBooking/{id}")
	public ResponseEntity<?> searchBookingByID(@PathVariable("id") int bookingId) {

		return bookingService.findBookingById(bookingId);
	}

	@DeleteMapping("/deleteBooking/{id}")
	public void deleteBookingByID(@PathVariable("id") int bookingId) {

		bookingService.deleteBooking(bookingId);
	}
}


