package com.hillel.lonzhansky.lessons.lesson12.homework;

import java.util.Scanner;

public class FitnessMain {
    public static void main(String[] args) {
        FitnessClient fitnessClient1 = new FitnessClient("Den", 29,7,1994, "Loznahnsky", 75, 4000);
        FitnessClient fitnessClient2 = new FitnessClient("Alex", 19,5,1990, "Pupkin", 88, 6500);

        fitnessClient1.printAccountInfo();
        fitnessClient2.printAccountInfo();

        System.out.println(fitnessClient1.getName());
    }

}
