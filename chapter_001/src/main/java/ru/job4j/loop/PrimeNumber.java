package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int a = 2; a <= finish; a++) {
            count++;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    count --;
                    break;
                }
            }
        }
        return count;
    }
}

