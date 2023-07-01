package com.proxima.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.lang.IndexOutOfBoundsException;

public class StreetOrganiser  {
	/* THis is a graph data type */
	// TODO add Search Function
	// TODO add sort function.

	private static final Exception IndexOutOfBoundsException = null;
	private List<Street> streetList;
	private List<ArrayList<StreetEdge>> neighbourList;

	public StreetOrganiser() {

		streetList = new ArrayList<Street>();
		neighbourList = new ArrayList<ArrayList<StreetEdge>>();
	}

	
	public void add(Street t) {

		streetList.add(t);
		neighbourList.add(new ArrayList<StreetEdge>());
	}

	public Street getStreet(int index){
		return streetList.get(index);
	}

	public ArrayList<StreetEdge> getNeighbours(Street s) {
		int index = indexOf(s);
		if (index != -1)
			return neighbourList.get(index);
		else
			return new ArrayList<>(); // empty list
	}

	public void addNeighbour(Street origin, Street destination, int distance) {
		int originIndex = streetList.indexOf(origin);
		int destinationIndex = streetList.indexOf(destination);
		if (originIndex != -1 && destinationIndex != -1) {
			StreetEdge neighbour = new StreetEdge(destination, distance);
			neighbourList.get(originIndex).add(neighbour);
		}

	}


	public boolean contains(Street t) {

		return streetList.contains(t);
	}


	public boolean find(String streetname)
	{
		boolean found = false;
		for(Street s : streetList)
		{
			if(streetname.equals(s.getStreetName())) found = true;

		}

		return found;
	}


	public boolean find(Street street)
	{
		boolean found = false;
		for(Street s : streetList)
		{
			if(street.equals(s)) found = true;

		}

		return found;
	}

	public int findIndex(String streetname)
	{
		int found = -1;
		for(int i =0; i < streetList.size(); i++ )
		{
			if(streetname.equals(streetList.get(i).getStreetName()))
			{
				found = i;

			}
			
		}

		return found;
	}

public int findIndex(Street street)
	{
		int found = -1;
		for(int i =0; i < streetList.size(); i++ )
		{
			if(street.equals(streetList.get(i)))
			{
				found = i;

			}
			
		}

		return found;
	}


	public Street remove(Street t) {
		streetList.remove(t);
		return t;

	}


	public int indexOf(Street t) {

		return streetList.indexOf(t);
	}


	public boolean isEmpty() {
		return streetList.isEmpty();
	}


	public ArrayList<Street> getPath(Street t) {

		return getPath(streetList.get(0), t);
	}


	public void insert(Street t, Street u) {
		if (streetList.contains(t))
			streetList.add(streetList.indexOf(t), u);
		else {
			streetList.add(t);
			streetList.add(u);
		}

	}


	public Street getStart() {

		return streetList.get(0);
	}

	public Street[] toArray() {
		Street[] streets = streetList.toArray(new Street[streetList.size()]);

		return streets;
	}


	//IMplementtation of Djikstra's Algorithm with a priority Queue implementation

	public ArrayList<Street> getPath(Street t, Street r) {

		int streetCount = streetList.size(); //total nodes
		int[] distances = new int[streetCount];
		int[] previous = new int[streetCount];
		int tally = 0;
		PriorityQueue<Street> priorityQueue = new PriorityQueue<Street>();

		Arrays.fill(distances, Integer.MAX_VALUE);
		Arrays.fill(previous, -1);

		int startStreet = indexOf(t);
		int endStreet = indexOf(r);

		if (startStreet == -1 || endStreet == -1) {
			return new ArrayList<Street>();
		}
		distances[startStreet] = 0;

		
		streetList.get(startStreet).setStreetLength(0);
		priorityQueue.add(streetList.get(startStreet));

		System.out.println(""+t.toString()+" -> "+ r.toString());

		while (!priorityQueue.isEmpty()) {
			

			int currentStreet = streetList.indexOf(priorityQueue.poll());
			if (currentStreet == endStreet ){
				ArrayList<Street> path = new ArrayList<Street>();
				int index = endStreet;
				while (index != -1) {
					path.add(streetList.get(index));
					index = previous[index];


				}

				
				Collections.reverse(path);
				
			
				return  path;

			}
			

			ArrayList<StreetEdge> neighbours = neighbourList.get(currentStreet);
			for (StreetEdge neighbour : neighbours) {
				int next = streetList.indexOf(neighbour.getNeighbour());
				int distance = neighbour.getDistance();
				int distanceElapsed = distances[currentStreet] + distance;

				if (distanceElapsed < distances[next]) {
					distances[next] = distanceElapsed;
					previous[next] = currentStreet;
					streetList.get(currentStreet).setStreetLength(distanceElapsed);
					priorityQueue.add(streetList.get(currentStreet));


				}

			}

		}

		return new ArrayList<Street>();
	}


	public int size() {
		return streetList.size();
	}

}
