package com.epam.balls.model;

import com.epam.balls.main.BallApplication;

public class Basket {
    private int numberOfBalls;
    public int getNumberOfBalls() {
        return numberOfBalls;
    }
    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
    }


    private String[] colourOfBall = new String[numberOfBalls];
    private double [] weightOfBall = new double[numberOfBalls];

    public String[] getColourOfBall() {
        return colourOfBall;
    }

    public void setColourOfBall(String[] colourOfBall) {
        this.colourOfBall = colourOfBall;
    }

    public double[] getWeightOfBall() {
        return weightOfBall;
    }

    public void setWeightOfBall(double[] weightOfBall) {
        this.weightOfBall = weightOfBall;
    }

}
