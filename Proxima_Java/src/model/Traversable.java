package model;

public interface Traversable<T> {
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
