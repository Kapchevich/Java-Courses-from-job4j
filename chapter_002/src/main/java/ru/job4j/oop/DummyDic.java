package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String say = "Method";
        return say;
    }

    public static void main(String[] args) {
        DummyDic stud = new DummyDic();
        String translate = stud.engToRus();
        System.out.println( "Неизвестное слово." + translate);


    }
}
