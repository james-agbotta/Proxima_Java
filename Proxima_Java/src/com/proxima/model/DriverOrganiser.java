package com.proxima.model;

public class DriverOrganiser implements Organisable<Driver> {
	/*This is a linked list based stack datatype */

	private Driver top;
	private int count;// count of drivers in stack.


	public DriverOrganiser(){
		top = null;
		count = 0;

	}
	public DriverOrganiser(Driver top){
		this.top = top;
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
			t.setNextDriver(top);
			top=t;
			count++;
		}

	}

	

	@Override
	public void connect(Driver a, Driver b) {//Might cause trouble if used.
		// Connects (and inadvertently truncates a stack) both drivers must be in the stack
		if(this.contains(a)&&this.contains(b)) 
		{
			
		}
		
		
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
		count--;
		return temp;
	}

	@Override
	public int indexOf(Driver t) {
		int count ;
	DriverOrganiser test = this;
	count = findIndex(0,t,test);
		return count;
	}
	
	private int findIndex(int start, Driver query, DriverOrganiser list)
	{
		if(list.isEmpty()) 
		{return -1;}
		else if(list.getStart().equals(query)) 
		{
			return start;
		}
		else 
		{
			start++;
			return findIndex(start, query, new DriverOrganiser(list.getStart().getNextDriver()));
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		// Assume count is always accurate
		return (count ==0) && (top==null); 
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
	if(!this.isEmpty()) {
		Driver current = top;
		Driver[] drivers = new Driver[this.size()];
		for(int i=0; i< drivers.length; i++) 
		{
			drivers[i] = current;
		current=current.getNextDriver();
		}
		
		return drivers;
	}
	else return null;
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
