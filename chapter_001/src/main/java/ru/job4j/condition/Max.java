package ru.job4j.condition;

public class Max {
    public static int max (int a, int b) {
        boolean max1 = a != b;
        int result = max1 ? (a>b? a:b) : (a<b? a:b);
        return result;
    }
}
