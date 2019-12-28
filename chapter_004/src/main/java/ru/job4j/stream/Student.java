package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {
   private String name;
   private int scope;


   public Student(String name, int scope) {
       this.name = name;
       this.scope = scope;
   }

    public String getName() {
        return name;
    }

    public int getScope() {
        return scope;
    }

    @Override
    public int compareTo(Student o) {
        return o.getScope() - this.scope;
    }
    public List<Student> levelOf(List<Student> students, int bound) {
       List<Student> list = students.stream()
               .flatMap(Stream::ofNullable)
               .sorted()
               .takeWhile(i -> i.getScope() > bound)
               .collect(Collectors.toList());
       return list;
    }
}
