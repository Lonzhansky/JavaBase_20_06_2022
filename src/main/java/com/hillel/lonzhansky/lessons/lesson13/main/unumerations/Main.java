package com.hillel.lonzhansky.lessons.lesson13.main.unumerations;

public class Main {
    public static void main(String[] args) {

//        TransportTypeClass transportTypeClass = new TransportTypeClass(); //ERROR!!!

//        System.out.println(TransportTypeClass.MOTORCYCLE);
//        System.out.println(TransportTypeClass.CAR);
//        System.out.println(TransportTypeClass.BUS);
//        System.out.println(TransportTypeClass.TRUCK);
//
//        System.out.println();

//        System.out.println(TransportType.MOTORCYCLE.ordinal());
//        System.out.println(TransportType.CAR.getTitle());
//        System.out.println(TransportType.BUS);
//        System.out.println(TransportType.TRUCK.ordinal());

//        TransportType[] values = TransportType.values();
//        for (TransportType value : values) {
//            System.out.println(value.ordinal());
//            System.out.println(value.getTitle());
//            System.out.println();
//        }

        TransportType car = TransportType.valueOf("CAR");
        System.out.println(car.getTitle());




    }
}
