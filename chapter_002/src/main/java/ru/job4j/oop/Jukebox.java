package ru.job4j.oop;

public class Jukebox {
    public void music(double position) {
        if (position < 0.5) {
            System.out.println("Спокойной ночи");
        } else if (position > 0.5) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position > 0.9) {
            System.out.println("Песня не найдена");
        }


    }
    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        double song = Math.random();
        box.music(song);

    }
}
