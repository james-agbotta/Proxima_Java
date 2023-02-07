package com.proxima.model;

public class DriverOrganiser implements Organisable<Driver> {
	/*This is a linked list based stack datatype */

	private Driver top;
	private int count;// count of drivers in stack.


	public DriverOrganiser(){
		top = null;
		count = 0;

	}
	

	@Override
	public void add(Driver t) {
		// TODO Complete add(Driver t);
		if(this.isEmpty()&&(top==null)){
			top = t;
			count++;
		} // require a robust method for ensuring an empty list
		else{
			// set t.next = top
			// set top = t
			t.setNextDriver(top);
			top=t;
		}

	}

	

	@Override
	public void connect(Driver a, Driver b) {//Might cause trouble if used.
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Driver t) {
		boolean  result = false;
		Driver current = top;
		Driver next = top.getNextDriver();
		result = t.equals(current);
		while(!result &&(next != null)){
			current = next;
			next = current.getNextDriver();
			result = current.equals(t);
		}
	
		return result;
	}

	@Override
	public Driver remove(Driver t) {
		// TODO Auto-generated method stub

		return null;
	}

	public Driver popDriver()
	{
		Driver temp = top;
		top= top.getNextDriver();
		return temp;
	}

	@Override
	public int indexOf(Driver t) {
	
		int count =0;
	Driver current = top;
	Driver next = current.getNextDriver();

//test current, if true, do nothing, else move to next.
    while(next!=null){
		if (!current.equals(t))count++;
		else{
		current= next;
		next = current.getNextDriver();
		}
	}

		return count;
	}

	@Override
	public boolean isEmpty() {
		// Assume count is always accurate
		return count ==0; 
	}

	@Override
	public Driver[] getPath(Driver t) {//Path from start to point t
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void insert(Driver t, Driver u) {// insert u at point t
		// TODO Auto-generated method stub
		
	}


	@Override
	public Driver getStart() {
		return top;
	}

	@Override
	public Driver[] toArray() {
		// This might not work, hopefully it tests swell
		Driver current = top;
		Driver[] list = new Driver[count];
		int i=0;
		while(current!=null&& i<count){
			list[i]=current;
		}
		return list;
	}

	@Override
	public Driver[] getPath(Driver t, Driver r) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int size() {
		// Should work... maybe
		return count;
	}

	

}
