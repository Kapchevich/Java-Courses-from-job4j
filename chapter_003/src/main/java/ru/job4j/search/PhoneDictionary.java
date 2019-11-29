package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (key.contains(this.persons.get(i).getName()) ||
                    key.contains(this.persons.get(i).getSurname()) ||
                    key.contains(this.persons.get(i).getPhone()) ||
                    key.contains(this.persons.get(i).getAddress())) {
                result.add(this.persons.get(i));
            }
        }
        return result;
    }
}

