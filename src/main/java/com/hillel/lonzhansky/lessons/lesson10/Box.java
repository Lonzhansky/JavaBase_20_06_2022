package com.hillel.lonzhansky.lessons.lesson10;

public class Box {
    int a;
    int b;
    int h;

    int volume() {
        return a * b * h;
    }

    void printVolume() {
        System.out.println(volume());
    }
}
