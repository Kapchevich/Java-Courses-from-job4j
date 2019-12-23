package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private String surname;

    public Student(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Student student = (Student) o;
        return Objects.equals ( surname, student.surname );
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}
