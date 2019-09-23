package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double accrued = amount * (percent/100);
        double total = amount + accrued;
        while (total >0) {
            total -= salary;
            year++;
        } return year;
    }
    }
