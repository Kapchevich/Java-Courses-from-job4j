package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int a = 0;
        int index = array.length - 1;
        for (int i = index - 1; i >= 0; i--) {
            String chr = array[i];
            if ( chr == null) {
                array[i] = array[index - a];
                array[index - a] = chr;
                a++;
            }
        }return array;
    }
}