package ru.job4j.stream;
import org.junit.Test;

import java.util.*;


import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentTest {
    @Test
    public void listToMap() {
        Student student0 = null;
        Student student1 = new Student("Vadim", 93);
        Student student2 = new Student("Petr", 68);
        Student student3 = null;
        Student student4 = new Student("Ivan", 90);
        Student student5 = new Student("Oleg", 74);
        Student student6 = new Student("Aleksey", 50);
        Student student7 = null;
        List<Student> test = new ArrayList<>();
        test.add(student0);
        test.add(student1);
        test.add(student2);
        test.add(student3);
        test.add(student4);
        test.add(student5);
        test.add(student6);
        test.add(student7);
        Student a = new Student();
        List<Student> res = a.levelOf(test, 50);
        List<Student> exp = List.of(student1, student4, student5, student2);

        assertThat(res, is(exp));
    }
}
