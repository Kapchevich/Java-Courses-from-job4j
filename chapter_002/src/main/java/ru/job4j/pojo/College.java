package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mikhail");
        student.setSurname("Litovchenko");
        student.setGroup("Java programmer");
        student.setEnrollment("17.10.2019");
        System.out.println(student.getName() + " " + student.getSurname() + " entered on " + student.getGroup() + " in " + student.getEnrollment());
    }
}
