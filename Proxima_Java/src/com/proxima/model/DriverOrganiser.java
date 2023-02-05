package com.proxima.model;

public class DriverOrganiser implements Organisable<Driver> {
	/*This is a linked list based stack datatype */

	private Driver top;
	private int count;// count of drivers in stack.
	private int activeCount;


	public DriverOrganiser(){
		top = new Driver("NaN");
		count = 0;
	}
	

	@Override
	public void add(Driver t) {
		// TODO Complete add(Driver t);
		if(this.isEmpty()){
			top = t;
			count++;
		} // require a robust method for ensuring an empty list
		else{
			// set t.next = top
			// set top = t
			

		}

	}

	public int getActiveCount(){
		return activeCount;
	}

	

	@Override
	public void connect(Driver a, Driver b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Driver t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Driver remove(Driver t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Driver t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// Assume count is always accurate
		return count ==0; 
	}

	@Override
	public Driver[] getPath(Driver t) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void insert(Driver t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEqualTo(Driver t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Driver getStart() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public Driver[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver[] getPath(Driver t, Driver r) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	

}
