package com.hillel.lonzhansky.lessons.lesson11.main.task2;

public class Car {

    private boolean isStart;
    private double fuelLevel;
    private double carDistance = 0;
    public int countPassangersSeats;

    public void start() {
        System.out.println("car starting...");
        startEngine();
        startElectronic();

        isStart = true;
    }

    public void stop() {
        System.out.println("car stopin...");
        isStart = false;
    }

    public void move() {
        System.out.println("move 100 km");
        carDistance += 100;
    }


    private void startEngine() {
        System.out.println("engine starting...");
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("fuel system starting...");
    }

    private void startElectronic() {
        System.out.println("electronic system starting...");
    }

    public boolean isStart() {
        return isStart;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getCarDistance() {
        return carDistance;
    }

    public int getCountPassangersSeats() {
        return countPassangersSeats;
    }

    public void setCarDistance(double carDistance) {
        this.carDistance = carDistance;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

}
