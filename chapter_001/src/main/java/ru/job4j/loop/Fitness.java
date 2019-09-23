package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *=3;
            System.out.println(ivan);
            nik *=2;
            System.out.println(nik);
            month ++;
            System.out.println(month);
        }
        return month;
    }
}