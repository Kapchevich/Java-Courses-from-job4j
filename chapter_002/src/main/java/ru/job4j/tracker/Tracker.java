package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);

    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(this.position++, item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (item != null && item.getId().equals(id)) {
                items.set(i, item);
                result = true;
                break;
            }
        }return result;
    }

    public Item findById(String id) {
       Item result = null;
       for (int i = 0; i < this.position; i++) {
           Item find = items.get(i);
           if (find != null && find.getId().equals(id)) {
               result = find;
           }
       } return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items.get(i) != null && items.get(i).getId().contains(id)) {
                items.remove(i);
                result = true;
                this.position--;
                break;
            }
        } return result;
    }

    public List<Item> findByName(String key) {
        int count = 0;
        List<Item> find = new ArrayList<>();
        for (int i = 0; i < this.position; i++) {
            if (items.get(i) != null && items.get(i).getName().equals(key)) {
                find.add(items.get(i));
            }
        }
        return find;
    }

    public List<Item> findAll() {
        return this.items;

    }
}

