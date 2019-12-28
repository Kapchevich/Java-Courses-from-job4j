package baza;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < 101; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
            }
        System.out.println(list);
        }
}
