package ru.job4j.oop.Profession;

public class Profession {
    private String name;
    private String surname;
    private String education;

    public Profession(String name, String surname, String education) {
        this.name = name;
        this.surname = name;
        this.education = education;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
    public void setName() {
        this.name = name;
    }
    public void setSurname() {
        this.surname = surname;
    }
    public void setEducation() {
        this.education = education;
    }
}
