package com.proxima.model;

public class Driver {
	private Driver nextDriver;
	private Driver previousDriver;
	
	
	
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
	
	

}
