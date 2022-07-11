package com.hillel.lonzhansky.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Вложенные циклы О(n^2)
//        O = n1 * n2 * n3;

//        O (N)

//        int count = 0;
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < 3; k++) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        1, 2, 3, 4, 5


//        boolean[] arrayNP = new boolean[10];//
//        arrayNP[0] = true;
//        arrayNP[5] = true;
//        arrayNP[9] = true;//
//        System.out.println(Arrays.toString(arrayNP));

//        int[] array = new int[5];
////        int array2[] = new int[3];
//        int[] array2 = new int[] {1, 2, 3, 4, 5};
//        int[] array3 =  {1, 2, 3, 4, 5};
//        int[] array4 = new int[0];
//        int[] array5 = {};

//        array4[0] = 10; // ERROR

//        array[0] = 23;
//        array[1] = -1;
//        array[2] = 67;
//
//        array[array.length - 1] = 99;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

//        for (int i = 0; i < array.length; i++) {
//            array[i] = i * 2;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 4) {
//                array[i] = 99;
//            }
//            System.out.println(array[i]);
//        }
//        System.out.println();
//
//        System.out.println(Arrays.toString(array));
//        System.out.println();
//
//        for (int value : array) {
//            System.out.println(value);
//        }

//        task1();
//        task2();
//        task3();


        int[] demo = {1, 2, 3, 4};
//        int[] demo2 = demo;
//        int[] demo3 = demo;
//
//        int[] demoCopy = new int[demo.length + 1];
//        demoCopy[0] = demo[0];
//        demoCopy[1] = demo[1];
//        demoCopy[2] = demo[2];
//        demoCopy[3] = demo[3];
//        demoCopy[4] = 11;
//
//
//        System.out.println(Arrays.toString(demo));
//        System.out.println(Arrays.toString(demo2));
//
//        demo[0] = 99;
//        demo2[1] = 77;
//
//        System.out.println(Arrays.toString(demo));
//        System.out.println(Arrays.toString(demo2));
//        System.out.println(Arrays.toString(demo3));
//        System.out.println(Arrays.toString(demoCopy));

        int a = 10;
        System.out.println(a);
        changeNumber(a);
        System.out.println(a);

        System.out.println(Arrays.toString(demo));
        changeElement(demo);
        System.out.println(Arrays.toString(demo));
    }

    static void changeNumber(int number) {
        number = 99;
    }

    static void changeElement(int[] array) {
        array[0] = -11;
    }

    static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    static void task2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("max: " + max + ", index: " + index);
    }

    static void task3() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                team1 += array[i];
            } else {
                team2 += array[i];
            }
        }

        System.out.println("team1: " + team1);
        System.out.println("team2: " + team2);

        if (team1 > team2) {
            System.out.println("team1 win");
        } else if (team1 < team2) {
            System.out.println("team2 win");
        } else {
            System.out.println("draw");
        }

//        System.out.println(
//                team1 > team2
//                        ? "team1 win"
//                        : team1 < team2
//                            ? "team2 win"
//                            : "draw");

    }
}
