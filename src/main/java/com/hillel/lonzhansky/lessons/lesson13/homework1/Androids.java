package com.hillel.lonzhansky.lessons.lesson13.homework1;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call from Android");
    }

    @Override
    public void sms() {
        System.out.println("sms from Android");
    }

    @Override
    public void internet() {
        System.out.println("internet from Android");
    }

    @Override
    public void getOS() {
        System.out.println("It`s Linux");
    }
}
