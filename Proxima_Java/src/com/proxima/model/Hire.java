package com.proxima.model;

public class Hire implements Traversable<Hire> {
	
	private Driver assignedDriver;
	private Customer hiringCustomer;
	private Hire nextHire;
	private Hire previousHire;
	private enum status {Booked, Ongoing, };
	
	

	@Override
	public Hire next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hire previous() {
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
	public void add(Hire t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hire remove(Hire t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Hire t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Hire t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNext(Hire t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPrevious(Hire t) {
		// TODO Auto-generated method stub
		
	}

}
