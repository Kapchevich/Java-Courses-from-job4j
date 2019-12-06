package ru.job4j.sort;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int compareTo(User nextUser) {
            return this.getAge() - nextUser.getAge();
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

