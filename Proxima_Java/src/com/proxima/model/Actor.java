package com.proxima.model;

public class Actor implements Comparable<Actor>{

	private String id;
	private String name;
	private Street currentStreet;
	public enum State{DISENGAGED,WAITING,ENGAGED,COMPLETE};
	private State currentState;
	
	public Actor(String id)
	{
		this.id =id;
		name ="";
		currentStreet = new Street("null",0);
		currentState = State.DISENGAGED;
	}
	
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
	
	public void setCurrentState(State state) 
	{
		currentState =state;
	}
	
	public State getState() 
	{
		return currentState;
	}

	@Override
	public int compareTo(Actor o) {
		// First test if the id's are the same, then check the names.
				int temp =  this.id.compareTo(o.getID());
				if (temp ==0) temp += this.name.compareTo(o.getName());
				return temp;
	}

	
	
}
