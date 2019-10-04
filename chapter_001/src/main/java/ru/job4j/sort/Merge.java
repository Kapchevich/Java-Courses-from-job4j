package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int c = 0; c < rsl.length; c++) {
            if (l == left.length) {
                rsl[c] = right[c - l];
            } else if (r == right.length) {
                rsl[c] = left[c - r];
            }
                else if (left[l] > right[r]) {
                    rsl[c] = right[r];
                    r++;
                } else {
                    rsl[c] = left[l];
                    l++;

                }

            }
        return rsl;
        }
    }
