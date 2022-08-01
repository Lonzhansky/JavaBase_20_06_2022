package com.hillel.lonzhansky.lessons.lesson13.main.unumerations;

import java.util.Locale;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        run();
        System.out.println("Всего выдано: " + DriverLicense.count + " лицензий");

    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите тип транспортного средства");
            String value = scanner.nextLine();
            TransportType transportType = null;
            if (value.equals("no")) {
                break;
            } else {
                transportType = TransportType.valueOf(value.toUpperCase(Locale.ROOT));
            }



            int years = -1;
            while (true) {
                System.out.println("Введите количество лет стажа");
                if (scanner.hasNextInt()) {
                    years = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    if (scanner.next().equals("no")) {
                        break;
                    }
                }
            }

            boolean ok = false;
            switch (transportType) {
                case MOTORCYCLE:
                    System.out.println(
                            "Для вождения " + transportType.getTitle()
                                    + " необходима категория " + TransportCategory.A);
                    ok = checkYears(years, transportType);
                    break;
                case CAR:
                    System.out.println(
                            "Для вождения " + transportType.getTitle()
                                    + " необходима категория " + TransportCategory.B);
                    ok = checkYears(years, transportType);
                    break;
                case BUS:
                    System.out.println(
                            "Для вождения " + transportType.getTitle()
                                    + " необходима категория " + TransportCategory.D);
                    ok = checkYears(years, transportType);
                    break;
                case TRUCK:
                    System.out.println(
                            "Для вождения " + transportType.getTitle()
                                    + " необходима категория " + TransportCategory.C);
                    ok = checkYears(years, transportType);
                    break;
            }

            if (ok) {
                System.out.println("Права выданы");
                new DriverLicense();
            } else {
                System.out.println("Недостаточно стажа");
            }
        } while (true);
    }

    private static boolean checkYears(int years, TransportType transportType) {
        switch (transportType) {
            case MOTORCYCLE: {
                return years > 3;
            }
            case CAR: {
                return years > 0;
            }
            case BUS: {
                return years > 7;
            }
            case TRUCK: {
                return years > 5;
            }
            default: {
                return false;
            }
        }
    }
}
