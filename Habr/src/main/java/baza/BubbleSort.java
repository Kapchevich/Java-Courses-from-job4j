package baza;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 1;
        array[2] = 2;
        array[3] = 6;
        array[4] = 5;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int q = array[index];
                array[index] = array[index + 1];
                array[index + 1] = q;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
