package com.proxima.model;

public class Actor {

	private String id;
	private String name;
	private Street currentStreet;
	
	
	public void setID(String id) 
	{
		this.id= id;
	}
	
	public String getID() {
		return id;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setCurrentStreet(Street currentStreet) {
		this.currentStreet = currentStreet;
	}
	
	public Street getCurrentStreet() 
	{
		return currentStreet;
	}

	
	
}
