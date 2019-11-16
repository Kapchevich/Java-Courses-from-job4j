package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int i = 0;
        int change = money - price;
        while (change > 0) {
            change -= COINS[i];
            rsl[size] = COINS[i];
            size++;
            if (change < COINS[i]) {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.change(50,35);
    }
}
