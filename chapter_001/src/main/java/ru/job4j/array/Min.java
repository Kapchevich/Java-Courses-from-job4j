package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            System.out.println(index + "index");
            if (min > array[index]) {
                min = array[index];
                System.out.println(min + "min");
            }
        }
        return min;
    }
}
