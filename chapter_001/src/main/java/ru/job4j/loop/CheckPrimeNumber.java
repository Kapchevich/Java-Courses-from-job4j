package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        for (int i = 2; i <= finish; i++) {
            System.out.println(i);
            if (finish % i == 0) {
                prime = false;
                System.out.println(prime);
            } else prime = true;
            break;
        } return prime;
    }
}
