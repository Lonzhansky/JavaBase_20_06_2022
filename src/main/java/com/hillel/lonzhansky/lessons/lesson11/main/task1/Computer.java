package com.hillel.lonzhansky.lessons.lesson11.main.task1;

public class Computer {

    protected String processor;
//    default or private--package
    String monitor;
    double price;


    public Computer(String processor) {
        this.processor = processor;
    }

    public Computer(String processor, String monitor) {
        this.processor = processor;
        this.monitor = monitor;
    }

    public Computer(String processor, String monitor, double price) {
        this.processor = processor;
        this.monitor = monitor;
        this.price = price;
    }


    void demo() {
        processor = "gfsdgsfg";
    }
}
