package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {

    @Override
    public String draw() {
        String expect = new StringJoiner(System.lineSeparator(), "", "")
                .add("  O  ")
                .add(" O O ")
                .add("OOOOO")
                .toString();
        return expect;
    }
}
