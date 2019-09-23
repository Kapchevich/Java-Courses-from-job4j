package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        for (int i = 1; i <= finish; i++) {
            System.out.println(i);
            if (i % 5 == 0) {
                System.out.println(prime);
                prime = true;
            }
        }

        return prime;
    }
}
