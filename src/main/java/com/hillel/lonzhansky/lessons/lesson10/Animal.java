package com.hillel.lonzhansky.lessons.lesson10;

public class Animal {

    double weight;
    double height;
    int age;

    double getWeightAnimalFood() {
       return (weight * height / age) * 100;
    }


}
