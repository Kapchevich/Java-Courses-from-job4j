package ru.job4j.condition;

public class MultiMax {
    public int max (int first, int second, int third) {
        int result = first;
        if (first!=second) {
            if (first>second) {
                return first;
            } else if (second>first) {
                return second;
            }
            if (third > first) {
                return third;
            } else if (third>second) {
                return third;
            }
        }return result;
    }
}
