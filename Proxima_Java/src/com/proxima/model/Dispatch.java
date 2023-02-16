package com.proxima.model;

public class Dispatch implements Organisable{
   private Hire currentHire;
   private Hire frontHire;
   private StreetOrganiser map;
   private DriverOrganiser drivers;
   
   public Dispatch() 
   {
	   currentHire = null;
	   frontHire = null;
	   map = new StreetOrganiser();
	   drivers = new DriverOrganiser();
	   
	   
   }
   
   public Hire getFrontOfHireList() 
   {
	   return frontHire;
   }
   
   
   
   public Hire getCurrentHire() {
	   return currentHire;
   }

@Override
public void add(Object t) {
	// TODO Auto-generated method stub
	
}

@Override
public void insert(Object t, Object u) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean contains(Object t) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Object remove(Object t) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object getStart() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(Object t) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] getPath(Object t) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] getPath(Object t, Object r) {
	// TODO Auto-generated method stub
	return null;
}
   
   

}
