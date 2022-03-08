package model;

public class Driver implements Alertable, Traversable<Driver> {
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

}
