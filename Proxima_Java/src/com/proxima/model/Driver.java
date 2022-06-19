package com.proxima.model;

public class Driver  implements Comparable, Alertable, Traversable<Driver> {
	private int driverID;
	private String driverName;
	private int carID;
	

	@Override
	public Driver next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver previous() {
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
	public void add(Driver t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Driver remove(Driver t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Driver t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Driver t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alert sendAlert(int priority, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alert sendReply(int acknoledgement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alert sendReply(int acknoledgement, int priority, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addNext(Driver t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPrevious(Driver t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alert sendAlert(String message) {
		// TODO Auto-generated method stub
		return null;
	}

}
