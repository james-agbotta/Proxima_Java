package com.proxima.model;

public interface Organisable<T> {
	public void add(T t);
	public int connect(T a, T b);
	public boolean contains (T t);
	public T root();
	public T remove(T t);
	public int indexOf(T t);
	public boolean isEmpty();
	public T[] getPath(T t);
}
