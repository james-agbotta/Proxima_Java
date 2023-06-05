package com.proxima.model;





public class Street implements Comparable<Street>{
	/*
	 * Things to test. 
	 * 1. Have a means to log the position of junction in a list
	 * 2. means to rank neighbours
	. 
	 * 3. pre-emptive representation of graph system (either vertices or matrix. )
	 * 
	 */
	/**
	 * Assumnption: The length of the street is the length to next street
	 * 
	 */

	
	private String streetName;
	private String postCode;
	
	private double streetLength;

	
	
	/*procedures*/
	public Street(String name, String postCode) 
	{
		streetName = name;
		this.postCode =postCode;
		streetLength = 0;// used in calculating distance in search algorithm
		

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
	
	

	public double getStreetLength() {
		return streetLength;
	}

	public void setStreetLength(double streetLength) {
		this.streetLength = streetLength;
	}

	
	
	
	
	public boolean isValid() {
		//TODO complete
		return false;
	}
	


	@Override
	public String toString() 
	{
		return  streetName + ", "+ postCode; 
	}

	@Override
	public int compareTo(Street o) {
		// First test if the street-names are the same, then the post-codes
		int temp =  this.streetName.compareTo(o.getStreetName());
		if (temp ==0) temp += this.postCode.compareTo(o.getPostCode());
		return temp;
	}
	

	

}
