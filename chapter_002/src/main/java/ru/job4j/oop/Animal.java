package ru.job4j.oop;

public class Animal {
    public Animal(String name) {
        System.out.print(name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Animal ");
        Animal predator = new Predator(" Predator ");
        Animal tiger = new Tiger(" Tiger");
    }
}
