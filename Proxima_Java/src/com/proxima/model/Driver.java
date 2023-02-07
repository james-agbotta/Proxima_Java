package com.proxima.model;

public class Driver extends Actor{
	//This is a stack of drivers
	

	private Driver nextDriver;
	private int rating; // Rating from 1 - 5
	
	public Driver(String id) {
		super(id);
		rating= 3;// This is the average 
		nextDriver = null;
		
	}


	public Driver getNextDriver() 
	{
		return nextDriver;
	}
	
	public void setNextDriver(Driver driver) 
	{
		nextDriver = driver;
	
	}
	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	@Override
	public String toString()
	{
		return "Driver id: "+this.getID()+". Currently located: "+this.getCurrentStreet().getStreetName();
	}


	@Override
	public String getIdentity()
	{
		return "Driver";
	}



}
