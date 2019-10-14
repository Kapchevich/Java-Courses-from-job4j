package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Clean code", 120);
        Book book1 = new Book("Book 1", 56);
        Book book2 = new Book("Book 2", 24);
        Book book3 = new Book("Book 3", 78);

        Book[] arr = new Book[4];
        arr[0] = book0;
        arr[1] = book1;
        arr[2] = book2;
        arr[3] = book3;

        for (int index = 0; index < arr.length; index++) {
            Book all = arr[index];
            System.out.println(all.getName() + "  " + all.getCount());

        }
        System.out.println(" ");
        Book a = arr[0];
        arr[0] = arr[3];
        arr[3] = a;
        for (int index = 0; index < arr.length; index++) {
            Book all = arr[index];
            System.out.println(all.getName() + "  " + all.getCount());
        }
        System.out.println(" ");
        for (int index = 0; index < arr.length; index++) {
            Book all = arr[index];
            if (all.getName() == "Clean code") {
                System.out.println(all.getName() + "  " + all.getCount());
            }
        }
    }
}
