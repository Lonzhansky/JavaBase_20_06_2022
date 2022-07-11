package com.hillel.lonzhansky.lessons.lesson7;

import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {

        task2();
    }

    static void task2() {
        int countShuttle = 1;
        int numberShuttle = 1;
        while (countShuttle <= 100) {
            if (check(numberShuttle)) {
                System.out.println("number: " + numberShuttle + " - count shuttle: " + countShuttle);
                countShuttle++;
            }
            numberShuttle++;
        }
    }

    static boolean check(int num) {
//        String str = String.valueOf(num);
//        return !(str.contains("4") ||  str.contains("9"));

//        if (num == 4 || num == 9 || num % 10 == 4 || num % 10 == 9 || (num % 100) / 10 == 4 || (num % 100) / 10 == 9) {
//            return false;
//        } else {
//            return true;
//        }

//        return !(num == 4 || num == 9 || num % 10 == 4 || num % 10 == 9 || (num % 100) / 10 == 4 || (num % 100) / 10 == 9);

        int result = num % 10;
        do {
            if (result == 4 || result == 9) {
                return false;
            }
            num /= 10;
            result = num % 10;
        } while (num > 0);
        return true;
    }

    static void task1() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 11);
        int restart;
        do {
            System.out.println(randomNumber);
            System.out.println("you have 3 attempts ");
            boolean isWin = false;
            for (int i = 2; i >= 0; i--) {
                if (randomNumber == getNumber(scanner)) {
                    isWin = true;
                    break;
                } else {
                    System.out.println("try again, you have attempts: " + i);
                }
            }
            System.out.println(isWin ? "you win" : "you lose");
            System.out.println("do you want play again? if yes - enter 1, no - enter 2");
            restart = getRestartNumber(scanner);
        } while (restart == 1);
    }

    static int getRestartNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result == 1 || result == 2) {
                    return result;
                } else {
                    System.out.println("please enter number 1 or 2");
                }
            } else {
                scanner.next();
                System.out.println("wrong input, try again");
            }
        }
    }

    static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= 0 && result <= 10) {
                    return result;
                } else {
                    System.out.println("please enter number from 0 to 10");
                }
            } else {
                scanner.next();
                System.out.println("wrong input, try again");
            }
        }
    }
}
