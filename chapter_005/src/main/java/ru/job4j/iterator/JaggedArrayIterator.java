package ru.job4j.iterator;

import java.util.Iterator;

public class JaggedArrayIterator implements Iterator {
    private final int[][] value;
    private int index1 = 0;
    private int index2 = 0;

    public JaggedArrayIterator(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        boolean result = true;
        if (value.length - 1 == index1 && value[index1].length <= index2) {
            result = false;
        }
        return result;
    }

    @Override
    public Object next() {
        if (value[index1].length <= index2) {
            index1++;
            index2 = 0;
        }
        return value[index1][index2++];
    }
}

