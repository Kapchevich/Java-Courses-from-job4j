package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        if (finish == 2) return true;
        for (int i = 2; i < finish; i++ ) {
            if (finish % i == 0) {
                prime = false;
                break;
            } else if (finish % i != 0) {
                prime = true;
            }
        }
        return prime;
    }
}
