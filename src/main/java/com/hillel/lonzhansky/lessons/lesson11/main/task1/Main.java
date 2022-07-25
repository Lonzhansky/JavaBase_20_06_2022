package com.hillel.lonzhansky.lessons.lesson11.main.task1;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Intel i9-12900K", "Samsung 22\" ", 2000, "Logitech 32432");
        Notebook notebook = new Notebook("Intel i5-7900", "Asus 16\" ", 800, "Toch 434");
        Console console = new Console("Console processor ", "Samsun 20\" ", 1800, "Dual Shock");

        Computer computer = new Computer("I9");
        computer.processor = "sdfds";


        Notebook notebookCopy = new Notebook(notebook);
        notebookCopy.price = 999;

        pc.printMouseModel();
        notebook.printTouchpadModel();
        console.printJoystickModel();

        System.out.println(pc.price);
        System.out.println(notebook.price);
        System.out.println(notebookCopy.price);
        System.out.println(console.price);

    }

}
