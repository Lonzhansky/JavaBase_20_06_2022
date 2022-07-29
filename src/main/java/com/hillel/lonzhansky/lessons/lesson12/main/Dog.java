package com.hillel.lonzhansky.lessons.lesson12.main;

public class Dog extends Animal implements Runnable {

    @Override
    void greeting() {
        System.out.println("Гав-гав");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void demo() {

    }
}
