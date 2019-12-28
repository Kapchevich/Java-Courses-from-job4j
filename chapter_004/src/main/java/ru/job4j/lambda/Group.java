package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Group {
    public  Map<String, Set<String>> sections(List<Student> students) {
        List<Holder> holderList = new ArrayList<>();
        for (Student student : students) {
            for (String unit : student.getUnits()) {
                holderList.add(new Holder(student.getName(), unit));
            }
        }
        Map<String, Set<String>> map = holderList.stream().collect(Collectors.groupingBy(Holder::getValue,
                Collectors.mapping(Holder::getKey, Collectors.toSet())));
        return map;
    }
}
