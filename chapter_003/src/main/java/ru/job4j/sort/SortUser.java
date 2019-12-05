package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {
    Set<User> user = new TreeSet<>();
    public Set<User> sort (List<User> list) {
        for (User i : list) {
            user.add(i);
        }
        return user;
    }
}
