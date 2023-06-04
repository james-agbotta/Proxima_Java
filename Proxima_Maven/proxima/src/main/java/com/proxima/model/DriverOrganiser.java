package com.proxima.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
		Driver current = this.top;
		Driver previous = null;
		Driver next = current.getNextDriver();
		int max=0;
		boolean found = false;
		if(this.contains(t)) 
		{
			while(!found && (max < this.size())) 
			{
				if(current.equals(t)) 
				{
					if(previous!=null) {//assume not top of stack
						previous.setNextDriver(next);
						current.setNextDriver(null);
					}
					else {//if this is the top of the stack
						this.popDriver(); //assuming the t == top pf stack 
					}
					found = true;
 
				}else 
				{
					previous=current;
					current=next;
					next = current.getNextDriver();
					
					max++;
				}
				
			}
		}
		if (found) return t; 
		else return null;
	}
	@Override
	public void insert(Driver t, Driver u) {// insert u at point t
		Driver current = this.top;
		Driver next = current.getNextDriver();
		
		int max =0;
		boolean found = false;
		if(this.contains(t)) 
		{
			while(!found && (max < this.size())) {
				if(current.equals(t)) 
				{
					u.setNextDriver(next);
					current.setNextDriver(u);
					this.count++;
					found = true;
				}
				else {
					
					current=next;
					next = current.getNextDriver();
					max++;
				}
				
			}
		}
		
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
		
		Driver[] path = {};
		int queryIndex = 0;
		Driver current = this.getStart();
		if(this.contains(t)) {
			queryIndex = this.indexOf(t) ;
			path = new Driver[queryIndex+1];
		
			for(int i = 0; i< path.length; i++) {
				path[i] = current;
				current = current.getNextDriver();
			}
		}
	
		return path;
		}


	@Override
	public Driver[] getPath(Driver t, Driver r) {
		Driver[] path = {};
		Driver[] fullList = this.toArray();
		
		if((this.contains(t))&&(this.contains(r))) {
			
		int lesser = (this.indexOf(t) < this.indexOf(r)) ? this.indexOf(t):this.indexOf(r) ;
		int greater = (this.indexOf(t) > this.indexOf(r)) ? this.indexOf(t):this.indexOf(r) ;
		path = new Driver[greater-lesser+1];
		for(int i = 0; i < path.length; i ++) 
		{
			path[i]= fullList[i+lesser]; //use lesser as offset
		}
		}
		return path;
	}

	


	@Override
	public Driver getStart() {
		return top;
	}
	

	@Override
	public Driver[] toArray() {
		//This is problematic, It seems to clear the array sometimes
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
	public int size() {
		// Should work... maybe
		return count;
	}

	

}
