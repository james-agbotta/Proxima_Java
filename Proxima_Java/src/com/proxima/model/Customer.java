package com.proxima.model;

public class Customer implements Comparable, Traversable<Customer>{
	
	private String bookingName;
	private Address bookingAddress;
	private Customer nextCustomer;
	private Customer previousCustomer;
	
	

	@Override
	public Customer next() {
		// TODO Add validation and error catching.
		return nextCustomer;
	}

	@Override
	public Customer previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Customer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer remove(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Customer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Customer t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
