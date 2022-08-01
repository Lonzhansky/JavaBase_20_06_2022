package com.hillel.lonzhansky.lessons.lesson13.main.nested;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door doorLeft = new Door();
    public Door doorRight = new Door();

    private int someInt = 10;
    private static int someInt2 = 22;

    public Car() {
        for (int i = 0; i < 3; i++) {
            wheels[i] = new Wheel();
        }
    }

    public void demoInner() {
        System.out.println(engine.someIntInnerClass);
    }

    public void move() {
        System.out.println("car moving ");
    }

//    public void move2() {
//        System.out.println("car moving skdhfosdjfhosdhfodshf osd fhosdhf ");
//    }


    public void demoLocalClass() {

        int someInt = 20;

        if (5 > 3) {
            final class DemoLocal {
                private int x = 5;

                public DemoLocal() {
                }

                public void doSomething() {
                    System.out.println("sadfsdfsd");
                }
            }
            DemoLocal demoLocal = new DemoLocal();
            System.out.println(demoLocal.x);
            demoLocal.doSomething();
        }

//        DemoLocal demoLocal2 = new DemoLocal(); // ERROR!!!
    }





    class Engine {

        private int someIntInnerClass = 20;

        public void start() {
        }

        public void stop() {
        }
        public void demo() {
            System.out.println(someInt);
            System.out.println(someInt2);
        }
    }

    static class Wheel {

        public static String str = "QWERTY";

        public void inflare(int psi) {
        }

        public void demo() {
            System.out.println(someInt2);
        }
    }

    class Window {
        public void rollUp() {
        }

        public void rollDown() {
        }
    }

    class Door {
        public Window window = new Window();

        public void open() {
        }

        public void close() {
        }
    }
}
