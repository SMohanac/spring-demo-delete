package com.manipal.demo.service;


import org.springframework.http.ResponseEntity;

import com.manipal.demo.model.Booking;


public interface BookingService {

	void createBooking(Booking newBooking);

	Iterable<Booking> displayAllBooking();

	ResponseEntity<?> findBookingById(int bookingId);

	void deleteBooking(int bookingId);

}
