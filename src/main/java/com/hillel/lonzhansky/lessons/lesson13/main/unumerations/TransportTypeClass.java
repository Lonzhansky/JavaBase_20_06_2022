package com.hillel.lonzhansky.lessons.lesson13.main.unumerations;

public class TransportTypeClass {

    private String title;

    public static final TransportTypeClass MOTORCYCLE = new TransportTypeClass("Мотоцикл");
    public static final TransportTypeClass CAR = new TransportTypeClass("Автомобиль");
    public static final TransportTypeClass BUS = new TransportTypeClass("Автобус");
    public static final TransportTypeClass TRUCK = new TransportTypeClass("Грузовик");

    private TransportTypeClass(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
