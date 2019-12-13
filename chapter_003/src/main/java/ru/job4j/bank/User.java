package ru.job4j.bank;

public class User {
    private String name;
    private String pasport;

    public User() {
    }
    public User(String name, String pasport) {
        this.name = name;
        this.pasport = pasport;
    }

    public String getName() {
        return name;
    }

    public String getPasport() {
        return pasport;
    }
}
