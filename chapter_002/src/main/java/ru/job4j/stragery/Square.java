package ru.job4j.stragery;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("O O O O");
        pic.append("\n");
        pic.append("O     O");
        pic.append("\n");
        pic.append("O     O");
        pic.append("\n");
        pic.append("O O O O");
        return pic.toString();
    }
}
