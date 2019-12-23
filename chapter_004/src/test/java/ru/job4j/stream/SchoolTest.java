package ru.job4j.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SchoolTest {
    School school = new School();
    Student student1 = new Student("Pushkin");
    Student student2 = new Student("NePushkin");


    @Test
    public void listToMap() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        Map<String, Integer> res = school.toMap(studentList);
        Map<String, Integer> exp = new HashMap<>();
        exp.put(student1.getSurname(), student1.hashCode());
        exp.put(student2.getSurname(), student2.hashCode());
        assertThat(res, is(exp));
    }
}
