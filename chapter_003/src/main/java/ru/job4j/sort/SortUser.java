package ru.job4j.sort;

import java.util.*;

public class SortUser {
    private Set<User> user = new TreeSet<>();
    private List<User> userList = new ArrayList<>();

    public Set<User> sort (List<User> list) {
        return new TreeSet<User>(list);
    }

    public List<User> sortNameLength (List<User> list) {
        for (User i : list){
            userList.add(i);
            Comparator nameLength = new NameLengthSort();
            Collections.sort(userList, nameLength);
        }
        return userList;
    }

    public List<User> sortByAllFields (List<User> list) {
        for (User i : list) {
            userList.add(i);
            Comparator allParam = new SortByName().thenComparing(new SortByAge());
            Collections.sort(userList, allParam);
        }
        return userList;
    }
}
