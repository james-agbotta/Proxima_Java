package com.proxima.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Class Actor
 * 
 * Class created for general Inheritance
 */
public class Actor implements Comparable<Actor> {

	@XmlElement(name = "phone")
	private String id;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "street")
	private String currentStreet;

	public enum State {
		DISENGAGED, WAITING, ENGAGED, COMPLETE
	};

	private State currentState;

	public Actor(String id) {
		this.id = id;
		name = "";
		currentStreet = "";
		currentState = State.DISENGAGED;
	}


	/**
	 * Set ID
	 * 
	 * Sets the ID field for the class
	 * @param id
	 */
	@XmlAttribute
	public void setID(String id) {
		this.id = id;
	}
/**
 * getId()
 * Returns class ID 
 * 
 * @return id
 */
	public String getID() {
		return id;
	}

	/**
	 * setName()
	 * 
	 * Sets the Actors name variable
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getName()
	 * 
	 * returns the Actors name variable
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setCurrent Street
	 * 
	 * Assigns the current street where the actor is located.
	 * 
	 * @param currentStreet
	 */
	public void setCurrentStreet(String currentStreet) {
		this.currentStreet = currentStreet;
	}

	/**
	 * 
	 * Retrieves the current street the actor is located.
	 * 
	 * @return currentStreet
	 */
	public String getCurrentStreet() {
		return currentStreet;
	}

	/**
	 * setCurrentState
	 * Assigns the current State of the Actor, from Enum set {DISENGAGED, WAITING, ENGAGED, COMPLETE}
	 * 
	 * @param state
	 */
	public void setCurrentState(State state) {
		currentState = state;
	}

	public State getState() {
		return currentState;
	}

	/* 
	 * compareTo()
	 * 
	 * Overides Comparable.compareTo 
	 * Compares Actors based on their ID and Name 
	*/
	@Override
	public int compareTo(Actor o) {
		// First test if the id's are the same, then check the names.
		int temp = this.id.compareTo(o.getID());
		if (temp == 0)
			temp += this.name.compareTo(o.getName());
		return temp;
	}

	@Override
	public String toString() {
		return "Actor: " + id + "named: " + name;
	}

	public String getIdentity() {
		return "Actor";
	}

}
