package com.hillel.lonzhansky.lessons.lesson13.homework1;

//        Сделайте интерфейс Smartphones, который должен содержать методы call(), sms(), internet()
//        Сделайте классы которые его имплементируют: Androids, iPhones.
//        Андроиды должны также имплементировать LinuxOS, айфоны в свою очередь должны имплементировать iOS
//        Создайте экземпляры каждого вида в мейн-классе

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();

        android.call();
        android.sms();
        android.internet();
        android.getOS();

        IPhones iPhone = new IPhones();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.getOS();
    }
}
