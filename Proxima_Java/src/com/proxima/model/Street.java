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
		connectedStreets = new Street[4];
		currentActors = new Actor[6];
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
	
}
