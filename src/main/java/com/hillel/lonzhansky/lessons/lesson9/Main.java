package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int value = 10;
//        int[][] array = new int[5][3];
//        int[][] arrayZero = new int[0][0];
//        int[][] arrayNull = null;
//
//        int[][] array2 = {
//                {1, 2, 3, 4, 5, 6, 7},
//                {4},
//                {7, 8, 9, 2, 4},
//                {7, value},
//                {}
//        };
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
//
//        array[2][0] = 7;
//        array[2][1] = 8;
//        array[2][2] = 9;

//        System.out.println(Arrays.deepToString(array));

//        System.out.println(array2.length);
//        System.out.println(array2[0].length);
//        System.out.println(array2[1].length);
//        System.out.println(array2[2].length);
//        System.out.println(array2[3].length);
//        System.out.println(array2[4].length);
//        System.out.println();
//
//        int number = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = number++;
//            }
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + " \t");
//            }
//            System.out.println();
//        }


//        int[][][] array3 = {
//                {
//                        {18, 28, 18, 28}, {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5}, {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55}, {1, 7, 38, 11}
//                }
//        };
//
//        System.out.println(Arrays.deepToString(array3));
//
//
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                for (int k = 0; k < array3[i][j].length; k++) {
//                    System.out.print(array3[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

//        task1();
//        task2();
//        task3();



        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8 ,9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();


    }

    static void task3() {
        // [5][2]
        int[][] array = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        // [2][5]
//        int[][] array2 = {
//                {1, 3, 5, 7, 9},
//                {2, 4, 6, 8, 10}
//        };
        int[][] array2 = new int[2][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " \t");
            }
            System.out.println();
        }




    }

    static void task2() {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                // ВАРИАНТ 1
//                if (i % 2 == 0) {
//                    if (j % 2 == 0) {
//                        array[i][j] = "B";
//                    } else {
//                        array[i][j] = "W";
//                    }
//                } else {
//                    if (j % 2 == 0) {
//                        array[i][j] = "W";
//                    } else {
//                        array[i][j] = "B";
//                    }
//                }

                // ВАРИАНТ 2
//                if ((i + j) % 2 == 0) {
//                    array[i][j] = "B";
//                } else {
//                    array[i][j] = "W";
//                }

                // ВАРИАНТ 3
                array[i][j] = ((i + j) % 2 == 0) ? "B" : "W";


            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("[" + i + "][" + j+ "] " + array[i][j] + " \t");
            }
            System.out.println();
        }

    }

//    1 0 0 0 1
//    0 1 0 1 0
//    0 0 1 0 0
//    0 1 0 1 0
//    1 0 0 0 1

//    Создать массив размером NxN. Заполнить массив с помощью цикла таким
//    образом, чтобы единица в каждой строке смещалась вправо:
    static void task1() {

        int[][] array = new int[5][5];
        // ВАРИАНТ 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }
        // ВАРИАНТ 2
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//        }
        // ВАРИАНТ 3
        for (int i = array.length - 1; i >= 0 ; i--) {
            array[i][i] = 1;
        }

        // ВАРИАНТ 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j >= 0 ; j--) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // ВАРИАНТ 2
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            if (i == j) {
//                continue;
//            }
//            0 4
//            1 3
//            2 2
//            3 1
//            4 0
            array[i][j] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("[" + i + "][" + j+ "] " + array[i][j] + " \t");
            }
            System.out.println();
        }
    }
}

















