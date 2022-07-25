package com.hillel.lonzhansky.lessons.lesson11.main.task1;

public class PC extends Computer {

    String mouse;

//    public PC() {
//        this("defaul", "mouse default", 2, "sdfgsdf");
//        demo();
//        mouse = "sfgsdfsdf";
//    }

    public PC(String processor, String mouse) {
        super(processor);
        this.mouse = mouse;
    }

    public PC(String processor, String monitor, String mouse) {
        super(processor, monitor);
        this.mouse = mouse;
    }

    public PC(String processor, String monitor, double price, String mouse) {
        super(processor, monitor, price);
        this.mouse = mouse;
    }

    public PC(PC pc) {
        this(pc.processor, pc.monitor, pc.price, pc.mouse);
    }


    public void demo() {
        System.out.println("demo");
    }

    void printMouseModel() {
        System.out.println("mouse model: " + mouse);
    }
}
