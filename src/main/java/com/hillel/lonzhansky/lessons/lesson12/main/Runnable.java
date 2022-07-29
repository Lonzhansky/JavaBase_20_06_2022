package com.hillel.lonzhansky.lessons.lesson12.main;

public interface Runnable {

    int distance = 100;

    void run();

    void demo();

    default void demoDefault() {
        System.out.println("I do something (DEFAULT Runnable)");
        demoPrivate();
    }

    private void demoPrivate() {
        System.out.println("i am private method");
    }

}
