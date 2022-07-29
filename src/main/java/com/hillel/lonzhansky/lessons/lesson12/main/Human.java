package com.hillel.lonzhansky.lessons.lesson12.main;

public class Human implements Runnable {

    private static int counter = 0;

    public int age;

    public Human(int age) {
        System.out.println("constructor run");
        this.age = age;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Human.counter = counter;
    }


    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void demo() {

    }
}
