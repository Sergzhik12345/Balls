package com.epam.balls.service;

import com.epam.balls.model.Basket;

public class FullMass {
    public double findFullMass(Basket basket){
        int fullMass=0;
        for (double weight: basket.getWeightOfBall()){
            fullMass+=weight;
        }

        return fullMass;
    }
}
