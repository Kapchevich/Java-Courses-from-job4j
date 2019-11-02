package ru.job4j.stragery;

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  O ");
        pic.append(" O O ");
        pic.append("O   O ");
        return pic.toString();
    }
}
