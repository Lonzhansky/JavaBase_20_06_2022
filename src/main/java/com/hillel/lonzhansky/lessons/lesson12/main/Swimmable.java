package com.hillel.lonzhansky.lessons.lesson12.main;

public interface Swimmable {

    void swim();

    void demo();

    default void demoDefault() {
        System.out.println("I do something (DEFAULT Swimmable)");
    }

    String getName();

    double getDistance();


}
