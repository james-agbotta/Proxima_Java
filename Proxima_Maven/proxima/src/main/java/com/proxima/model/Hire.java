package com.proxima.model;


public class Hire extends Actor
{	
	private int phoneNumPrefix;
	private int phoneNumSuffix;
	
	public int getPhoneNumSuffix() {
		return phoneNumSuffix;
	}


	public void setPhoneNumSuffix(int phoneNumSuffix) {
		this.phoneNumSuffix = phoneNumSuffix;
	}



	private Driver chosenDriver;
	private Hire nextHire;
	private String destination;
	
	
	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public Hire(String id) {
		super(id);
		chosenDriver = new Driver("00");
		nextHire = null;
	}



	public int getPhoneNumPrefix() {
		return phoneNumPrefix;
	}
	
	public void setPhoneNumPrefix(int phoneNumber) {
		this.phoneNumPrefix = phoneNumber;
	}
	

	public String getPhoneNumber()
	{
		return "0"+phoneNumPrefix+phoneNumSuffix;
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
		return "Hire";
	}

	@Override
	public String toString()
	{
		return "[id: "+this.getID()+", name "+ this.getName()+", phone number: 0"+phoneNumPrefix+phoneNumSuffix+"]";
	}

	
}
