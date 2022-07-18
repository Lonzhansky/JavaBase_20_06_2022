package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ARRAY_LENGTH = 7;
//        int[] company = new int[ARRAY_LENGTH];
        int[] player = new int[ARRAY_LENGTH];

//        // O(2N) -> O(N)
//        for (int i = 0; i < ARRAY_LENGTH; i++) {
//            company[i] = (int) (Math.random() * 10);
//            player[i] = (int) (Math.random() * 10);
//        }

        int[] company = getArray();

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            player[i] = getNumber(scanner);
        }

        Arrays.sort(company);
        Arrays.sort(player);

        System.out.println(Arrays.toString(company));
        System.out.println(Arrays.toString(player));

        int counter = 0;
        String str = "Элементы совпали в ";
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (company[i] == player[i]) {
                str += (i + 1) + ",";
                counter++;
            }
        }

        if (counter > 0) {
            str = str.substring(0, str.length() - 1);
            System.out.println(str + " ячейке(ах)");
        }
        System.out.println("Количество совпадений: " + counter);

        scanner.close();
    }

    static int[] getArray() {
        int[] temp = new int[7];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (int) (Math.random() * 10);
        }
        return temp;
    }

    static int getNumber(Scanner scanner) {
        int temp = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp < 0 || temp > 9) {
                    System.out.println("Please enter number from 0 to 9");
                } else {
                    return temp;
                }
            } else {
                System.out.println("Please enter number");
                scanner.next();
            }
        }
    }
}
