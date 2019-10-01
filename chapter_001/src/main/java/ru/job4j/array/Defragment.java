package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            String cahr = array[index];
            int j = index;
            if (cahr == null) {
                while (array[j] == null) {
                    if (j == array.length - 1) {
                        break;
                    }
                    j++;
                }
                    array[index] = array[j];
                    array[j] = null;
                }
            } return array;
        }
    }