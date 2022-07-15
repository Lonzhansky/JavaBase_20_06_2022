package com.hillel.lonzhansky.lessons.lesson8;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] target = {5, 6, 7};
        int[] source = {1, 2 , 3, 4};

        System.out.println("source: " + Arrays.toString(source));
        System.out.println("target: " + Arrays.toString(target));
        target = copyArray(source, target);
        System.out.println("target: " + Arrays.toString(target));
    }

    static void task1() {
        final int COUNT_PLAYERS = 25;

        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];

        int min = 18;
        int max = 40;

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            team1[i] = min + (int) (Math.random() * (max - min + 1));
            team2[i] = min + (int) (Math.random() * (max - min + 1));

            sumTeam1 += team1[i];
            sumTeam2 += team2[i];
        }

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        System.out.println((double) sumTeam1 / COUNT_PLAYERS);
        System.out.println((double) sumTeam2 / COUNT_PLAYERS);

     }

     static int[] copyArray(int[] source, int[] target) {

//        int[] result = new int[source.length + target.length];
//
//         for (int i = 0; i < target.length; i++) {
//             result[i] = target[i];
//         }
//
//         for (int i = 0; i < source.length; i++) {
//             result[i + target.length] = source[i];
//         }
//         return result;

         int[] result = new int[source.length + target.length];

         System.arraycopy(target, 0, result, 0, target.length);
         System.arraycopy(source, 0, result, target.length, source.length);

         return result;

     }
}
