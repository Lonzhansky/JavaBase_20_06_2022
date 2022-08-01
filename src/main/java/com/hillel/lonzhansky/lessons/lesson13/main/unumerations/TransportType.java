package com.hillel.lonzhansky.lessons.lesson13.main.unumerations;

public enum TransportType {

    MOTORCYCLE("Мотоцикл"),
    CAR("Автомобиль"),
    BUS("Автобус"),
    TRUCK("Грузовик");

    private String title;

    TransportType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
