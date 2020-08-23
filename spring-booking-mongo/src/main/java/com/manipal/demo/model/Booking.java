package com.manipal.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Booking")
public class Booking { 
	private int bookingId;
	private String flightDetails;
	private String passengerDetails;
	private int userId;
	
	public Booking() {
	    super();
	    // TODO Auto-generated constructor stub
	    }
	public Booking(int bookingId, String flightDetails, String passengerDetails, int userId) {
		super();
		this.bookingId = bookingId;
		this.flightDetails = flightDetails;
		this.passengerDetails = passengerDetails;
		this.userId = userId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public String getFlightDetails() {
		return flightDetails;
	}
	public String getPassengerDetails() {
		return passengerDetails;
	}
	public int getUserId() {
		return userId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public void setFlightDetails(String flightDetails) {
		this.flightDetails = flightDetails;
	}
	public void setPassengerDetails(String passengerDetails) {
		this.passengerDetails = passengerDetails;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
