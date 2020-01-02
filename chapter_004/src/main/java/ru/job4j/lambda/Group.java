package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Group {
    public  Map<String, Set<String>> sections(List<Student> students) {
        Map<String, Set<String>> map = students.stream().flatMap(s -> s.getUnits().stream().map(i -> new Holder(s.getName(), i))).collect(Collectors.groupingBy(Holder::getValue,
                Collectors.mapping(Holder::getKey, Collectors.toSet())));
        return map;
    }
}
