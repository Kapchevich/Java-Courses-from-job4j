package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;
        for (int i = n; i > 1; i--) {
            if (i == n) {
                result = 1 * n;
            } else if (i != n) {
                result *= i;
            } else {
                result = 1;
            }

        }
        if (result == 0) {
            return 1;
        }
        return result;
    }
}
