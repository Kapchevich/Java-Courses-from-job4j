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

    @Test
    public void sortCollections() {
        SortUser a = new SortUser();
        User first = new User("Kirill", 50);
        User second = new User("Anton", 50);
        User third = new User("Mikhail", 50);
        User four = new User("Anna", 50);
        List<User> list = Arrays.asList(first, second, third, four);
        List<User> result = a.sortNameLength(list);
        List<User> expect = new ArrayList<>();
        expect.add(four);
        expect.add(second);
        expect.add(first);
        expect.add(third);
        assertThat(result, is(expect));
    }
    @Test
    public void sortByAllParam() {
        SortUser a = new SortUser();
        User first = new User("Mikhail", 30);
        User second = new User("Anton", 25);
        User third = new User("Mikhail", 50);
        User four = new User("Anton", 18);
        List<User> list = Arrays.asList(first, second, third, four);
        List<User> result = a.sortByAllFields(list);
        List<User> expect = new ArrayList<>();
        expect.add(four);
        expect.add(second);
        expect.add(first);
        expect.add(third);
        assertThat(result, is(expect));
    }
}
