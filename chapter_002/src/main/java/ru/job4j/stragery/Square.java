package ru.job4j.stragery;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        String expect = new StringJoiner(System.lineSeparator(), "", "")
        .add("O O O O")
        .add("O     O")
        .add("O     O")
        .add("O O O O")
                .toString();
        return expect;
    }
}
