package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double dc) {
        return  (ab + ac > dc && ac + dc > ab && ab + dc > ac);
        }
    }
