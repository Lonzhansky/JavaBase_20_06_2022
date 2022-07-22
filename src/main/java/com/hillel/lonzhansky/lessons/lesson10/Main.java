package com.hillel.lonzhansky.lessons.lesson10;

public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box();
//        Box box2 = new Box();
//
//        box1.a = 10;
//        box1.b = 2;
//        box1.h = 5;
//
//        System.out.println(box1.a);
//        System.out.println(box1.b);
//        System.out.println(box1.h);
//
//        System.out.println(box2.a);
//        System.out.println(box2.b);
//        System.out.println(box2.h);
//
//
//        System.out.println(box1.volume());
//        System.out.println(box2.volume());
//
//        box1.printVolume();
//

//        ColorBox colorBox = new ColorBox();
//        colorBox.color = "Red";
//        colorBox.a = 10;
//        colorBox.b = 2;
//        colorBox.h = 5;
//
//        colorBox.printVolume();
//        System.out.println(colorBox.color);

        WoodBox woodBox1 = new WoodBox(22, 11, 15, 122);

        WoodBox woodBox2 = new WoodBox();

        WoodBox woodBox3 = new WoodBox("Red");

        System.out.println(woodBox1);
        System.out.println(woodBox2);
        System.out.println(woodBox3);


//        создаем класс Animal с несколькими полями и методом
//        Animal lion = new Animal();
//        lion.weight = 300.5;
//        lion.height = 1.6;
//        lion.age = 8;
//
//        System.out.println(lion.getWeightAnimalFood());

    }

}
