package com.epam.balls.main;

import com.epam.balls.model.Ball;
import com.epam.balls.model.Basket;
import com.epam.balls.service.FullMass;

public class BallApplication {
    public static void main (String[] args){
        Basket basket = new Basket();
        int number=0;                                      //начальное колличество мячей
        String[] currentColours;           //изначально массив с текущими цветами мячей пуст
        double[] currentWeight;            //изначально массив с массами мячей так же пуст, до тех пор пока не добавятся новые мячи

        Ball ball1 = new Ball("black", 2);  // 1-ый мяч
        number++;                                        // обозначаем, что добавили новый мяч
        currentColours= new String[number];            //пкркзаписываем ссылку на массив, исходя из текущего коллиества мячей
        currentColours[number-1] = ball1.getColour();    //добавляем новый цвет в массив
        currentWeight =new double[number];             //пкркзаписываем ссылку на массив, исходя из текущего коллиества мячей
        currentWeight[number-1]=ball1.getWeight();       //добавляем вес нового мяча в массив

        Ball ball2 = new Ball("black", 4);  // 2-ый мяч
        number++;
        currentColours= new String[number];
        currentColours[number-1] = ball2.getColour();
        currentWeight =new double[number];
        currentWeight[number-1]=ball2.getWeight();

        Ball ball3 = new Ball("white", 2);  // 3-ый мяч
        number++;
        currentColours= new String[number];
        currentColours[number-1] = ball3.getColour();
        currentWeight =new double[number];
        currentWeight[number-1]=ball3.getWeight();

        Ball ball4 = new Ball("blue", 3);  // 4-ый мяч
        number++;
        currentColours= new String[number];
        currentColours[number-1] = ball4.getColour();
        currentWeight =new double[number];
        currentWeight[number-1]=ball4.getWeight();

        basket.setNumberOfBalls(number);               //Передаём колличество мячей в карзину
        basket.setColourOfBall(currentColours);
        basket.setWeightOfBall(currentWeight);



    }
}
