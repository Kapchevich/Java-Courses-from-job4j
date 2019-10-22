package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        while (count >= 1) {
            System.out.println("На столе лежат " + count + " спичек");
            System.out.println("Сколько хотите взять?");
            System.out.print("Выберите число от 1 до 3:");
            int select = Integer.parseInt(input.nextLine());
            if (select <= 3) {
                System.out.println("Вы взяли " + select);
                count = count - select;
                if (count <= 0) {
                    System.out.println("Спичек больше нет!");
                    System.out.println("КОНЕЦ ИГРЫ");
                }
            } else if (select > 3) {
                System.out.println("Так не получится! Можно взять от 1 до 3 спичек");
            }
        }
    }
}
