package com.hillel.lonzhansky.lessons.lesson13.main.nested;

public class Main {

    public static void main(String[] args) {

        Car car = new Car() {
            @Override
            public void move() {
                System.out.println("car moving skdhfosdjfhosdhfodshf osd fhosdhf ");
            }
        };

        car.move();


        Car car2 = new Car();
        car2.move();


        DemoAbstractClass demoAbstractClass = new DemoAbstractClass() {
            @Override
            void demo() {
                System.out.println("demo ......");
            }
        };

        demoAbstractClass.demo();

    }

    static void demo2() {
        Smartphones smartphones = new Smartphones() {
            @Override
            public void call() {
                System.out.println("Call from anonymous class");
            }
        };

        smartphones.call();
    }

    static void demo1() {
        Car car = new Car();
        car.engine.demo();
        car.demoInner();

        car.demoLocalClass();


        Car.Wheel wheel = new Car.Wheel();
        wheel.demo();

        System.out.println(Car.Wheel.str);
    }
}
