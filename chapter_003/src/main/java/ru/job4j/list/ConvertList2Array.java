package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {

        public int[][] toArray(List<Integer> list, int rows) {
            int s = list.size();
            while (s % rows !=0) {
                s++;
            }
            int cells = s / rows;
            int w = 0;
            int[][] array = new int[rows][cells];
            for (int i = 0; i < rows; i++) {
                for (int q = 0; q < cells; q++) {
                    if (w < list.size()) {
                    array[i][q] = list.get(w);
                    w++;
                    } else {
                        array[i][q] = 0;
                    }

                }
            }
            return array;
        }
}
