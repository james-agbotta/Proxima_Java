package com.proxima.model;


public class Hire extends Actor
{
	public Hire(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	private int phoneNumber;
	private Driver chosenDriver;
	private Hire nextHire;
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Driver getChosenDriver() {
		return chosenDriver;
	}
	
	public void setChosenDriver(Driver chosenDriver) {
		this.chosenDriver = chosenDriver;
	}

	public Hire NextHire() {
		return nextHire;
	}

	public void setNextHire(Hire nextHire) {
		this.nextHire = nextHire;
	}
	

	@Override
	public String getIdentity()
	{
		return "Driver";
	}

	
}
