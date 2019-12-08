package ru.job4j.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        int result = 0;
        for (int i = 0; i != min; i++) {
            result = Integer.compare(leftChar[i], rightChar[i]);
            if (result != 0) {
                break;
            }
        }
        if (result == 0 && min < leftChar.length) {
            result = 1;
        } else if (result == 0 && min < rightChar.length) {
            result = -1;
        }

        return result;
    }
}
