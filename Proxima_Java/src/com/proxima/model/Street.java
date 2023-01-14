package com.proxima.model;

public class Street {

	private String streetName;
	private String postCode;
	private Street[] connectedStreets;
	private Actor[] currentActors;
	private int streetLength;
	
	/*procedures*/
	public Street(String name) 
	{
		streetName = name;
		postCode ="";
		setConnectedStreets(new Street[4]);
		setCurrentActors(new Actor[6]);
	}
	
	public void setStreetName(String name) 
	{
		streetName = name;
		
	}
	
	public String getStreetName(){
		return streetName;
	}
	
	public void setPostCode(String postCode){
		this.postCode =postCode;
	}
	
	public String getPostCode() {
		return postCode;
	}

	public Street[] getConnectedStreets() {
		return connectedStreets;
	}

	public void setConnectedStreets(Street[] connectedStreets) {
		this.connectedStreets = connectedStreets;
	}

	public Actor[] getCurrentActors() {
		return currentActors;
	}

	public void setCurrentActors(Actor[] currentActors) {
		this.currentActors = currentActors;
	}

	public int getStreetLength() {
		return streetLength;
	}

	public void setStreetLength(int streetLength) {
		this.streetLength = streetLength;
	}
	

}
