package ru.job4j.sort;

import java.util.Comparator;

public class NameLengthSort implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
