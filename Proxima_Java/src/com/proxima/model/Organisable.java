package com.proxima.model;

public interface Organisable<T> {
	public void add(T t);
	public void insert(T t, T u);// Might be redundant.
	public void connect(T a, T b);// This may not be used, or is redundant
	public boolean contains (T t);
	
	public boolean isEmpty();
	public T remove(T t);
	public T getStart();
	public int indexOf(T t);
	public int size();
	public T[] toArray();
 	public T[] getPath(T t);
	public T[] getPath(T t, T r);
}
