package com.hillel.lonzhansky.lessons.lesson12.main;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
//        cat.greeting();
//        cat.run();
//        cat.swim();
        cat.demoDefault();
        System.out.println(cat.getDistance());
        System.out.println(cat.getName());

        Dog dog = new Dog();
//        dog.greeting();
//        dog.run();
        dog.demoDefault();


        Runnable[] runnables = {
                new Cat(), new Dog(), new Human(22)
        };


        for (Runnable runnable : runnables) {
            runnable.run();
        }

    }


    static void demo2() {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.greeting();
        dog.greeting();

        if (cat instanceof Cat) {
            ((Cat) cat).someCatMethod();
        }

        if (dog instanceof Cat) {
            ((Cat) dog).someCatMethod();
        }
    }

    static void demo1() {
        Human human1 = new Human(20);
        Human human2 = new Human(10);
        Human human3 = new Human(30);
        Human human4 = new Human(40);
        Human human5 = new Human(44);

        Human.setCounter(55);


        System.out.println(human1.getCounter());
        System.out.println(human3.getCounter());
        System.out.println(human5.getCounter());

        System.out.println(Human.getCounter());
    }

}
