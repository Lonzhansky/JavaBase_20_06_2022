package com.hillel.lonzhansky.lessons.lesson10;

public class WoodBox extends ColorBox {

    int maxWeight;

    public WoodBox() {
        this.color = "Blue";
    }

    public WoodBox(String color) {
        this.color = color;
    }

    public WoodBox(int a, int b, int h, int maxWeight) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.maxWeight = maxWeight;
    }


//    public String toString() {
//        return "its class WoodBox have parameters: \na = " + a + "\nb = " + b + "\ncolor = " + color;
//    }

    @Override
    public String toString() {
        return "" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                ", color='" + color + '\'' +
                ", maxWeight=" + maxWeight;
    }
}
