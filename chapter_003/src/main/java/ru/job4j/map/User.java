package ru.job4j.map;

public class User {
    private String name;
    private String city;
    private int id;
    public User(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }
}
