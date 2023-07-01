 package com.proxima.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
  public class Driver extends Actor{
	//This is a stack of drivers
	
	
	private Driver nextDriver;
	private int rating; // Rating from 1 - 5

	


	public Driver(String id) {
		super(id);
		rating= 3;// This is the average 
		nextDriver = null;
		this.setCurrentState(Actor.State.WAITING);
		
	}



	public Driver getNextDriver() 
	{
		return nextDriver;
	}
	
	public void setNextDriver(Driver driver) 
	{
		nextDriver = driver;
	
	}

	public void engage()
	{
		this.setCurrentState(Actor.State.ENGAGED);
	}

	public void disengage()
	{
		this.setCurrentState(Actor.State.DISENGAGED);
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
		return "Driver id: "+this.getID()+". Currently located: "+this.getCurrentStreet()+ " Currently: "+this.getState();
	}


	@Override
	public String getIdentity()
	{
		return "Driver";
	}



}
