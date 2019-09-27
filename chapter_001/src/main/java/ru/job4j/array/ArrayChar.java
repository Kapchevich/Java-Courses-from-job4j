package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            for (int j = i; j == i ; j++){
                if (word[i] != pref[j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
