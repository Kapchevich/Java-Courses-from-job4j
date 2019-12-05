package ru.job4j.sort;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void sort() {
        SortUser a = new SortUser();
        User first = new User("Vasya", 50);
        User second = new User("Anton", 25);
        User third = new User("Mikhail", 30);
        User four = new User("Kirill", 18);
        List<User> list = Arrays.asList(first, second, third, four);
        Set<User> result = a.sort(list);
        Set<User> expect = new TreeSet<>();
        expect.add(four);
        expect.add(second);
        expect.add(third);
        expect.add(first);
        assertThat(result, is(expect));

    }
}
