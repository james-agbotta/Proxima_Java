package com.proxima.model;

public interface Organisable<T> {
	public void add(T t);
	public int connect(T t, T u);
	public boolean contains (T t);
	public boolean isEmpty();
	public T[] getPath(T t);
	

}
