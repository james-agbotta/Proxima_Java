package com.proxima.model;

public interface Traversable<T> {
	//Provided that T is Comparable, this should work
	public T next();
	public T previous();
	public boolean hasNext();
	public boolean hasPrevious();
	public void add(T t);
	public T remove(T t);
	public void insert(T t);
	public boolean contains(T t);
	public void clear();

	

}
