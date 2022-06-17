package com.proxima.model;

public class Customer implements Comparable<Customer>, Traversable<Customer>{
	
	private String bookingID;
	private String bookingName;
	private Address bookingAddress;
	private Customer nextCustomer;
	private Customer previousCustomer;
	private boolean empty;
	
	
	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public Customer() {
		bookingID ="";
		bookingName = "";
		nextCustomer = new Customer();
		previousCustomer = new Customer();
		empty= true;
		
	}
	
	public Customer(Customer t){
		this.bookingID = t.bookingID;
		this.bookingName = t.bookingName;
		this.bookingAddress = t.bookingAddress;
		empty = false;
		
	}
	
	
	public String getBookingID() {
		return bookingID;
	}
	
	
	

	@Override
	public Customer next() {
		// TODO Validate and error prevent next();
		return nextCustomer;
	}

	@Override
	public Customer previous() {
		// TODO Validate and error prevent previous();
		return previousCustomer;
	}

	@Override
	public boolean hasNext() {
		// TODO re-write Customer.hasNext() to verify properly
		return nextCustomer.isEmpty() != true;
	}

	@Override
	public boolean hasPrevious() {
		// TODO re-write Customer.hasPrevious() to verify properly
		return previousCustomer.isEmpty() != true;
	}

	@Override
	public void add(Customer t) {
		// TODO allow for validation in add();
		// TODO check  if this isEmpty(): is !isEmpty() this = t, else this.add(Next);

	}

	@Override
	public Customer remove(Customer t) {
		// TODO to remove, connect Previous.next = next.previous
		return null;
	}

	@Override
	public void insert(Customer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Customer t) {
		// TODO Finish Contains. Test if if the previous Node !isEmpty, previous.contains(t), else if This node isEmpty(), then if !isEmpty() test this == t, else test if Next == t.
		if(this.hasPrevious()) 
		{
			return previousCustomer.contains(t);
		}
		else if(!this.isEmpty()) 
		{
			if(this.equals(t)) return true;
		}
		else if(this.hasNext()) 
		{
			return this.nextCustomer.contains(t);
		}

		return false;//If none of the above returns a value, return false. 
	}

	@Override
	public void clear() {//clearing will disconnect the Customer node from the graph
		new Customer();
		
	}

	
	
	public boolean equals(Customer other) {
		return this.compareTo(other) == 0;
	}
	
	
	public boolean greaterThan(Customer other) 
	{
		return this.compareTo(other) > 0;
		
	}
	
	public boolean lessThan(Customer other) 
	{
		return this.compareTo(other) < 0;
		
	}

	@Override
	public int compareTo(Customer o) {

			return bookingID.compareTo(o.getBookingID());
		
	}

}
