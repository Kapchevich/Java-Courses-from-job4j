package ru.job4j.sort;

import java.util.Comparator;

public class SortByName implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.compareTo(o2);
    }
}
