package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double accrued = amount * (percent / 100);
        double total = amount + accrued;
        while (total > 0) {
            total -= salary;
            year++;
            if (total > 0) {
                double accrued2 = total * (percent / 100);
                double total2 = accrued2 + total;
                total = total2;
            }
        }
        return year;
    }
}

