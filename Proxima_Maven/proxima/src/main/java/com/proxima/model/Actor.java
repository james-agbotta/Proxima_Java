package com.proxima.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;


public class Actor implements Comparable<Actor>{

	@XmlElement(name= "phone")
	private String id;
	@XmlElement(name= "name")
	private String name;
	@XmlElement(name ="street")
	private String currentStreet;
	public enum State{DISENGAGED,WAITING,ENGAGED,COMPLETE};
	private State currentState;
	
	public Actor(String id)
	{
		this.id =id;
		name ="";
		currentStreet = "";
		currentState = State.DISENGAGED;
	}
	
	@XmlAttribute
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
	
	public void setCurrentStreet(String currentStreet) {
		this.currentStreet = currentStreet;
	}
	
	public String getCurrentStreet() 
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

	@Override
	public String toString()
	{
		return "Actor: "+id+ "named: "+name;
	}

	public String getIdentity()
	{
		return "Actor";
	}

	
	
}
