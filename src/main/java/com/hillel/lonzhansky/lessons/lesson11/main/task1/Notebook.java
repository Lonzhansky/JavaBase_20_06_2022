package com.hillel.lonzhansky.lessons.lesson11.main.task1;

public class Notebook extends Computer {

    String touchpad;

    public Notebook(String processor, String monitor, double price, String touchpad) {
        super(processor, monitor, price);
        this.touchpad = touchpad;
    }

    public Notebook(Notebook notebook) {
        this(notebook.processor, notebook.monitor, notebook.price, notebook.touchpad);
    }

    void printTouchpadModel() {
        System.out.println("touchpad model: " + touchpad);
    }
}
