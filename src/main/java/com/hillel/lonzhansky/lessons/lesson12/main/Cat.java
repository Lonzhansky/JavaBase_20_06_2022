package com.hillel.lonzhansky.lessons.lesson12.main;

public class Cat extends Animal implements Swimmable, Runnable {

    public void someCatMethod() {
        System.out.println("RUN CAT METHOD");
    }

    @Override
    void greeting() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void swim() {
        System.out.println("Cat swim");
    }

    @Override
    public void demo() {

    }


    @Override
    public void demoDefault() {
//        Swimmable.super.demoDefault();
        Runnable.super.demoDefault();
//        System.out.println("my realisation");
    }

    @Override
    public String getName() {
        return "lfgjoif";
    }

    @Override
    public double getDistance() {
        return 12321.434;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

}
