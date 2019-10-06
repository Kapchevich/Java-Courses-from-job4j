package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       double x = x2 - x1;
       double y = y2 - y1;
       double first = Math.pow(x, 2);
       double second = Math.pow(y, 2);
       double square = first + second;
       double sqrt = Math.sqrt(square);
       return sqrt;
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 4);
        System.out.println("result (0,0) to (2,4) " + result1);
        double result2 = distance(1, 12, 6, 18);
        System.out.println("result (1,12) to (6,18) " + result2);
        double result3 = distance(6, 1, 8, 12);
        System.out.println("result (6,1) to (8,12) " + result3);

    }
}
