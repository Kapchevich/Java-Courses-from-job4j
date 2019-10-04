package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return  value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dolarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro ");
        int dollar = rubleToDollar(140);
        System.out.println("140 rubles are  " + dollar + " dollar ");
        int rubToDoll = dolarToRuble(5);
        System.out.println("5 dollar are " + rubToDoll + " rubles ");
        int rubToEuro = euroToRuble(12);
        System.out.println("12 euro are " + rubToEuro + " rubles ");
    }

}
