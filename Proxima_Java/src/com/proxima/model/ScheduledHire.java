package com.proxima.model;

import java.util.Date;

public class ScheduledHire extends Hire{
	
	private Date bookingDate;
	private Date pickUpDate;
	
	
	
	public void setBookingDate(long bookingDate) 
	{
		this.bookingDate= new Date(bookingDate);
	}
	
	public void setPickupDate(long pickupDate) 
	{
		this.pickUpDate = new Date(pickupDate);
		
	}

}
