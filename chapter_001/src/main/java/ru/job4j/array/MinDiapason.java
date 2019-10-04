package ru.job4j.array;

public class MinDiapason {
        public static int findMin(int[] array, int start, int finish) {
            int min = array[start];
            for (int i = start; i <= finish; i++) {
                System.out.println(i + "i");
                if (min > array[i]) {
                    min  = array[i];
                    System.out.println(min + "min");
                }
            }
            return min;
        }
}
