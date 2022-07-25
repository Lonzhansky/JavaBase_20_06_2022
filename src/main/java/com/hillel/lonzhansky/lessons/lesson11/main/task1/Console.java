package com.hillel.lonzhansky.lessons.lesson11.main.task1;

public class Console extends Computer {

    String joystick;

    public Console(String processor, String monitor, double price, String joystick) {
        super(processor, monitor, price);
        this.joystick = joystick;
    }

    void printJoystickModel() {
        System.out.println("joystick model: " + joystick);
    }

    void demo() {
        price = 1111.1;
    }

}
