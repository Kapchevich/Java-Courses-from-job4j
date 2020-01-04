package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Group {
    public  Map<String, Set<String>> sections(List<Student> students) {
        Map<String, Set<String>> map = students.stream().flatMap(i -> i.getUnits().stream().map(s -> new Holder(i.getName(), s))).collect(Collectors.groupingBy(Holder::getValue,
                Collectors.mapping(Holder::getKey, Collectors.toSet())));
        return map;
    }
    }
