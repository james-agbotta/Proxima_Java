package com.proxima.model;



public class Hire 
{
	
	
	public enum State {
		UNINITIATED("No Hire"), BLACK_LISTED("Blacklisted"),BOOKED("Booked"), CANCELLED("Cancelled"), PICKED_UP("Picked up"), EN_ROUTE("In transit"),COMPLETE ("Completed") ;
		private final String stateValue;
		
		State(String stateValue){
			this.stateValue = stateValue;
		}
		
		private String value() 
		{
			return stateValue;
		}

	}


	
	

	private int phoneNumber;
	private Driver chosenDriver;
	private boolean isComplete;
	private State currentState;

	public void setCurrentState(String value) 
	{
		currentState = State.valueOf(value);
		
	}
	
	public State getCurrentState() {
		return currentState;
	}


	
}
