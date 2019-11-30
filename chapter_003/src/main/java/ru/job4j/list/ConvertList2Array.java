package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int s = list.size();
        while (s % rows != 0) {
            s++;
        }
        int cells = s / rows;
        int cellsFor = 0;
        int rowFor = 0;
        int[][] array = new int[rows][cells];
        for (Integer i : list) {
            array[rowFor][cellsFor] = i;
            if (cellsFor < cells -1) {
                cellsFor++;
            } else {
                rowFor++;
                cellsFor = 0;
            }
        }
        return array;
    }
}
