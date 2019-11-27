package ru.job4j.search;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < this.persons.size(); i++) {
            if (key.contains(persons.get(i).getName())
                    || key.contains(persons.get(i).getSurname())
                    || key.contains(persons.get(i).getAddress())
                    || key.contains(persons.get(i).getPhone())) {
                result.add(persons.get(i));
            }

        }return result;
    }
}

