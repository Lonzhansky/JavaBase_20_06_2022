package com.hillel.lonzhansky.lessons.lesson11.main.task2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.countPassangersSeats = 4;

        car.start();
        System.out.println(car.isStart());
        car.move();
        car.stop();


        System.out.println(car.countPassangersSeats);
        System.out.println(car.getFuelLevel());
        System.out.println(car.getCarDistance());
        System.out.println(car.isStart());

        System.out.println();

        car.setCarDistance(50);
        System.out.println(car.getCarDistance());
    }

}
