package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(179.5);
        System.out.println("Man 179.5 is  " + man);
        double woman = womanWeight(164.8);
        System.out.println("Woman 164.8 is  " + woman);
        }
    }
