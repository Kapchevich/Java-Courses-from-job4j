package ru.job4j.oop.Profession;

public class Engineer extends Profession {
    private String position;

    public Engineer(String name, String surname, String education, String position) {
        super(name, surname, education);
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition() {
        this.position = position;
    }
    public void create(Project project) {

    }
}
