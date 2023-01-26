package com.proxima.model;

public class Driver extends Actor{
	

	private Driver nextDriver;
	private Driver previousDriver;
	private int rating;
	
	public Driver(String id) {
		super(id);
		rating= 3;
		nextDriver = null;
		previousDriver = null;

	}
	
	public Driver getNextDriver() 
	{
		return nextDriver;
	}
	
	public void setNextDriver(Driver driver) 
	{
		
		nextDriver = driver;
	}
	
	public Driver getPreviousDriver() 
	{
		return previousDriver;
	}
	
	public void setPreviousDriver(Driver driver) 
	{
		previousDriver = driver;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	

}
