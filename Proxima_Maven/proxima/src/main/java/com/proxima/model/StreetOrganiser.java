package com.proxima.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.List;
import java.util.PriorityQueue;

public class StreetOrganiser implements Organisable<Street> {
	/* THis is a graph data type */
	// TODO add Search Function
	// TODO add sort function.

	private ArrayList<Street> streetList;
	private ArrayList<ArrayList<StreetEdge>> neighbourList;

	public StreetOrganiser() {

		streetList = new ArrayList<Street>();
		neighbourList = new ArrayList<ArrayList<StreetEdge>>();
	}

	@Override
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

	public void addNeighbour(Street origin, Street destination, double distance) {
		int originIndex = streetList.indexOf(origin);
		int destinationIndex = streetList.indexOf(destination);
		if (originIndex != -1 && destinationIndex != -1) {
			StreetEdge neighbour = new StreetEdge(destination, distance);
			neighbourList.get(originIndex).add(neighbour);
		}

	}

	@Override
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

	@Override
	public Street remove(Street t) {
		streetList.remove(t);
		return t;

	}

	@Override
	public int indexOf(Street t) {

		return streetList.indexOf(t);
	}

	@Override
	public boolean isEmpty() {
		return streetList.isEmpty();
	}

	@Override
	public Street[] getPath(Street t) {

		return getPath(streetList.get(0), t);
	}

	@Override
	public void insert(Street t, Street u) {
		if (streetList.contains(t))
			streetList.add(streetList.indexOf(t), u);
		else {
			streetList.add(t);
			streetList.add(u);
		}

	}

	@Override
	public Street getStart() {

		return streetList.get(0);
	}

	@Override
	public Street[] toArray() {
		Street[] streets = streetList.toArray(new Street[streetList.size()]);

		return streets;
	}


	//IMplementtation of Djikstra's Algorithm with a priority Queue implementation
	@Override
	public Street[] getPath(Street t, Street r) {

		Street[] path = null;
		ArrayList<Street> tempPath;
		// TODO Auto-generated method stub
		int streetCount = streetList.size();
		int[] distances = new int[streetCount];
		int[] previous = new int[streetCount];
		Arrays.fill(distances, Integer.MAX_VALUE);
		Arrays.fill(previous, -1);

		int startStreet = indexOf(t);
		int endStreet = indexOf(r);

		if (startStreet == -1 || endStreet == -1) {
			return path;
		}
		distances[startStreet] = 0;

		PriorityQueue<Street> priorityQueue = new PriorityQueue<Street>();
		streetList.get(startStreet).setStreetLength(0);
		priorityQueue.add(streetList.get(startStreet));

		while (!priorityQueue.isEmpty()) {
			Street temp = priorityQueue.poll();
			int currentStreet = streetList.indexOf(temp);
			if (startStreet == endStreet) {
				tempPath = new ArrayList<Street>();
				int index = endStreet;
				while (index != -1) {
					tempPath.add(streetList.get(index));
					index = previous[index];

				}
				Collections.reverse(tempPath);
				path = tempPath.toArray(new Street[tempPath.size()]);
				return path;

			}

			ArrayList<StreetEdge> neighbours = neighbourList.get(currentStreet);
			for (StreetEdge neighbour : neighbours) {
				int next = streetList.indexOf(neighbour.getNeighbour());
				double distance = neighbour.getDistance();
				double distanceElapsed = distances[currentStreet] + distance;

				if (distanceElapsed < distances[next]) {
					distances[next] = next;
					previous[next] = currentStreet;
					streetList.get(currentStreet).setStreetLength(distanceElapsed);
					priorityQueue.add(streetList.get(currentStreet));

				}

			}

		}

		return path;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
