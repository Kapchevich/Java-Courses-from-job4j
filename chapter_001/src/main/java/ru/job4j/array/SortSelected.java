package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (min > data[j]) {
                    min = data[j];
                    index = j;
                }

            }
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        } return data;
    }
}
