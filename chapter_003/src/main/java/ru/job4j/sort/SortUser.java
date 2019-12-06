package ru.job4j.sort;

import java.util.*;

public class SortUser {


    public Set<User> sort (List<User> list) {
        return new TreeSet<User>(list);
    }

    public List<User> sortNameLength (List<User> list) {
        List<User> arrayList = new ArrayList<User>(list);
            Comparator nameLength = new NameLengthSort();
            Collections.sort(arrayList, nameLength);
        return arrayList;
    }

    public List<User> sortByAllFields (List<User> list) {
        List<User> arrayList = new ArrayList<User>(list);
            Comparator allParam = new SortByName().thenComparing(new SortByAge());
            Collections.sort(arrayList, allParam);
        return arrayList;
    }
}
