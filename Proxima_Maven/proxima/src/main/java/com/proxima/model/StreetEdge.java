package com.proxima.model;

public class StreetEdge {
  
    

    private Street neighbour;
    private double distance;

    public StreetEdge(Street neighbour, double distance) {

        this.neighbour = neighbour;
        this.distance = distance;
    }

    public Street getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(Street neighbour) {
        this.neighbour = neighbour;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
}
