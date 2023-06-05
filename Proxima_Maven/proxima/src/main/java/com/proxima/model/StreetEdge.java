package com.proxima.model;

public class StreetEdge {
  
    

    private Street neighbour;
    private int distance;

    public StreetEdge(Street neighbour, int distance) {

        this.neighbour = neighbour;
        this.distance = distance;
    }

    public Street getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(Street neighbour) {
        this.neighbour = neighbour;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    
}
