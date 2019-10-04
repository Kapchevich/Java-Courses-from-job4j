package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = p - a;
        double second = p - b;
        double third = p - c;
        double four = Math.sqrt(p * first * second * third);
        return four;
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double square = first + second;
        double roo = Math.sqrt(square);
        return roo;
    }

    public static void main(String[] args) {
        double rsl = area(2, 2, 2);
        System.out.println("area (2,2,2) = " + rsl);
        double result1 = distance(0, 0, 2, 4);
        System.out.println("result (0,0) to (2,4) " + result1);
        double result2 = distance(1, 12, 6, 18);
        System.out.println("result (1,12) to (6,18) " + result2);
        double result3 = distance(6, 1, 8, 12);
        System.out.println("result (6,1) to (8,12) " + result3);
    }
}
