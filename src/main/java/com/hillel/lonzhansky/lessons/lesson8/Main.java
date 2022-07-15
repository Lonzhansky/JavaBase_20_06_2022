package com.hillel.lonzhansky.lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = {5, 1, 10, 7, 99, -7}; // length = 6. last index = 5
//
////        bubbleSortReverse(array);
//
//        Arrays.sort(array);
//        Arrays.sort(array, Collections.reverseOrder());
//
//        System.out.println(Arrays.toString(array));


//        int[] newArray = Arrays.copyOf(array, 20);
//        System.out.println(Arrays.toString(newArray));

//        int[] array = null;
//
//        array = new int[10];
//
//        array = null;
//
//        bubbleSort(array);

    }

//    a. Задать массив целых чисел длиной N элементов заполнить его рандомными числами
//     отсортировать его и вывести на экран поменять первый и последний элемент местами, вывести массив на экран еще раз
    static void task1() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println(Arrays.toString(array));
    }


    //    Создать массив из N чисел (вводим из консоли)
//    Разбить его на 2 массива равной длины
//    Отсортировать первую половину массива по возрастанию и вывести на экран
//    вторую половину массива отсортировать в обратном порядке и тоже вывести на экран
    public static void task2(int a) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter even number");
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n % 2 == 0) {
                    break;
                } else {
                    System.out.println("Please enter even number");
                }
            } else {
                System.out.println("Wrong data. Please try again");
                scanner.next();
            }
        }

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));

        int midle = array.length / 2;
        int[] array1 = Arrays.copyOf(array, midle);
        int[] array2 = Arrays.copyOfRange(array, midle, array.length);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        bubbleSort(array1);
        bubbleSortReverse(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }


    // O(N^2)
    static void bubbleSort(int[] array) {
//        if (array == null) {
//            System.out.println("BAD ARRAY!!!");
//            return;
//        }
        int temp = -1;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
//                temp = array[i] + array[i + 1];
//                array[i] = temp - array[i + 1];
//                array[i + 1] = temp - array[i];
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//        System.out.println("count = " + count);
    }

    // O(N^2)
    static void bubbleSortReverse(int[] array) {
        int temp = -1;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++;
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("count = " + count);
    }
}
