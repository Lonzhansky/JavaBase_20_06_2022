package com.hillel.lonzhansky.lessons.lesson12.homework;


/*

Сделайте программу для фитнес трекера, которая будет регистрировать нового пользователя создавая ему аккаунт, принимая следующие параметры:
Неизменяемые (задаются только при создании аккаунта, и могут быть получены только с помощью геттеров):
Имя
Дата рождения (отдельно день, месяц, год)
Емейл
Телефон
Изменяемые:
Фамилия
Вес
Давление
Количество пройденных за день шагов
Создавать каждого пользователя необходимо через конструктор, принимая все поля на вход конструктора.
Добавить метод printAccountInfo() при вызове которого распечатывать все данные о пользователе
После приема года - высчитывать возраст пользователя во внутреннюю переменную age (отталкиваясь просто от 2020 года, усложнять тут не будем), для которой сделать только геттер и выводить на экран вместе с остальными полями в методе printAccountInfo(); в конструкторе либо геттерах/сеттерах не используем вывод в консоль
В main-классе создать 3-5 пользователей и распечатать данные каждого вызвав метод printAccountInfo(); для двух пользователей изменить несколько полей и распечатать новые данные повторно

 */

public class FitnessClient {

    private final String name;
    private final int day;
    private final int month;
    private final int year;

    private String lastname;
    private double weight;
    private int countSteps;

    private int age;

    public FitnessClient(String name, int day, int month, int year, String lastname, double weight, int countSteps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.lastname = lastname;
        this.weight = weight;
        this.countSteps = countSteps;

        age = 2022 - year;
    }

    private boolean checkDay(int day) {
        return day > 0 && day < 31;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCountSteps() {
        return countSteps;
    }

    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
    }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.println("name='" + getName() + '\'' +
                ", day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear() +
                ", age=" + getAge() +
                ", lastname='" + getLastname() + '\'' +
                ", weight=" + getWeight() +
                ", countSteps=" + getCountSteps());
    }
}
