package com.hillel.lonzhansky.lessons.lesson13.homework1;

public class IPhones implements Smartphones, IOS {

    @Override
    public void call() {
        System.out.println("Call from IPhones");
    }

    @Override
    public void sms() {
        System.out.println("sms from IPhones");
    }

    @Override
    public void internet() {
        System.out.println("internet from IPhones");
    }

    @Override
    public void getOS() {
        System.out.println("It`s iOS");
    }
}
