package com.proxima.model;
import java.util.ArrayList;

public class Street implements Comparable<Street>{
	/*
	 * Things to test. 
	 * 1. Have a means to log the position of junction in a list
	 * 2. means to rank junctions. 
	 * 3. pre-emptive representation of graph system (either vertices or matrix. )
	 * 
	 */

	private String streetName;
	private String postCode;
	
	private int streetLength;
	private Street[] junctions;
	private double[] lengthsFromJunction;
	private ArrayList<String> actorsByID;
	
	
	/*procedures*/
	public Street(String name, int junction) 
	{
		streetName = name;
		postCode ="";
		junctions = new Street[junction];
		actorsByID= new ArrayList<String>();

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
	


	public int getStreetLength() {
		return streetLength;
	}

	public void setStreetLength(int streetLength) {
		this.streetLength = streetLength;
	}

	public String[] getActorsByID()
	{
		String[] temp = new String[actorsByID.size()];
		temp = actorsByID.toArray(temp);

		return temp;
	}
	
	public void addJunction() 
	{//TODO complete this by adding error checking and  balancing.
		
		
		int i =0;
		boolean complete = false;
		
		 
		do{
			//if()
			i++;
		}while (complete || i < junctions.length);
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
