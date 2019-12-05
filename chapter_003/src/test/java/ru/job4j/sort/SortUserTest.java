package ru.job4j.sort;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void sort() {
        SortUser a = new SortUser();
        User second = new User("Vasya", 20);
        User first = new User("Anton", 25);
        User third = new User("Mikhail", 30);
        List<User> list = Arrays.asList(first, second, third);
        Set<User> result = a.sort(list);
        Set<User> expect = new TreeSet<>();
        expect.add(first);
        expect.add(second);
        expect.add(third);
        assertThat(result, is(expect));

    }
}
