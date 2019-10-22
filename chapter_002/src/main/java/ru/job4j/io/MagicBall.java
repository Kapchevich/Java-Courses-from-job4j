package ru.job4j.io;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        int answer = new Random().nextInt(3);
        String name = input.nextLine();
        if (answer == 1) {
            System.out.println(name + "Да");
        } else if (answer == 2) {
            System.out.println(name + "Нет");
        } else if (answer == 3) {
            System.out.println(name + "Может быть");
        }
    }
}
