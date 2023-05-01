package com.epam.balls.model;

public class Ball {
    private String colour;
    private double weight;

    public Ball(String colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }
    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }
}
