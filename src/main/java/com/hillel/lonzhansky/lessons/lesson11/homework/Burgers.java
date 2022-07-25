package com.hillel.lonzhansky.lessons.lesson11.homework;

public class Burgers {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    // VERSION 1
//    public Burgers(String bun, String cheese, String greens, String mayonnaise) {
//        this.bun = bun;
//        this.meat = 1;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//        System.out.println( "Burger with: \n " +
//                "bun='" + bun + '\'' +
//                ", meat=" + meat +
//                ", cheese='" + cheese + '\'' +
//                ", greens='" + greens + '\'' +
//                ", mayonnaise='" + mayonnaise + '\'');
//    }
//
//    public Burgers(String bun, String cheese, String greens) {
//        this.bun = bun;
//        this.meat = 1;
//        this.cheese = cheese;
//        this.greens = greens;
//        System.out.println( "Burger without mayonnaise: \n " +
//                "bun='" + bun + '\'' +
//                ", meat=" + meat +
//                ", cheese='" + cheese + '\'' +
//                ", greens='" + greens + '\'');
//    }
//
//    public Burgers(String bun, String cheese, String greens, String mayonnaise, boolean isDouble) {
//        this.bun = bun;
//        this.meat = isDouble ? 2 : 1;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//        System.out.println( "Burger with double meat: \n " +
//                "bun='" + bun + '\'' +
//                ", meat=" + meat +
//                ", cheese='" + cheese + '\'' +
//                ", greens='" + greens + '\'' +
//                ", mayonnaise='" + mayonnaise + '\'');
//    }


    //VERSION 2
    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println( "Burger with: \n " +
                "bun='" + bun + '\'' +
                ", meat=" + meat +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'');
    }

    public Burgers(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println( "Burger without mayonnaise: \n " +
                "bun='" + bun + '\'' +
                ", meat=" + meat +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'');

        System.out.println(toString());
        System.out.println(this);
        System.out.println(this.toString());
    }

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise, boolean isDouble) {
        this.bun = bun;
        this.meat = (isDouble ? "double " : "") + meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println( "Burger with double meat: \n " +
                "bun='" + this.bun + '\'' +
                ", meat=" + this.meat +
                ", cheese='" + this.cheese + '\'' +
                ", greens='" + this.greens + '\'' +
                ", mayonnaise='" + this.mayonnaise + '\'');
    }


//    // BAD VERSION
//    public void getOriginalBurger(String bun, String meat, String cheese, String greens, String mayonnaise) {
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//        System.out.println( "Burger with: \n " +
//                "bun='" + bun + '\'' +
//                ", meat=" + meat +
//                ", cheese='" + cheese + '\'' +
//                ", greens='" + greens + '\'' +
//                ", mayonnaise='" + mayonnaise + '\'');
//    }

    @Override
    public String toString() {
        return "Burgers{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}
