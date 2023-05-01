package com.epam.balls.service;

import com.epam.balls.model.Basket;

import java.util.Arrays;

public class ColourCount {
    public int colurCount(Basket basket){
        String [] arr = basket.getColourOfBall();          //создаём массив, точно такой же как и массив с цветами мячей
        Arrays.sort(arr);                                  //Сортируем массивж

        int count = 0;                                     // количество повторений каждого цвета, по умолчанию 1
        String prev = arr[0];                              //Предыдущее значение

        for (String current : arr) {                       // Цикл for-each по отсортированному массиву строк
            if (current.equals(prev)) {                    // Если текущая строка повторяется
                count++;
            } else {                                       // Если текущая строка не повторяется
                System.out.println(prev + ": " + count);
                prev = current;
                count = 1;
            }
        }
        System.out.println(prev + ": " + count); // Вывод количества повторений последней строки
        return 0;
    }
}
