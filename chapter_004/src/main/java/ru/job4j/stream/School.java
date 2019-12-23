package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public Map<String, Integer> toMap(List<Student> students) {
        Map<String, Integer> map = students.stream().collect(Collectors.toMap(Student::getSurname, Student::hashCode));
        return map;
    }
}
