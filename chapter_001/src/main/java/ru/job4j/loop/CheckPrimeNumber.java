package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        for (int i = 2; i <= finish; i++) {
            if (finish % i == 0) {
                prime = false;
            } else prime = true;
            break;
        } return prime;
    }
}
