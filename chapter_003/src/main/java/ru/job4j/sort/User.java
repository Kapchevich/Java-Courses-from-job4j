package ru.job4j.sort;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int compareTo(User nextUser) {
        //if (this.age == nextUser.age) {
          //  return 0;
        //}else if (this.age < nextUser.age) {
          //  return -1;
        //}else {
            return this.name.compareTo(nextUser.name);
        }
    }

