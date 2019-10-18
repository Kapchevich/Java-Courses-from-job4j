package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (item != null && item.getId().equals(id)) {
                items[i] = item;
                result = true;
                break;
            }
        }return result;
    }
    public Item findById(String id) {
       Item result = null;
       for (int i = 0; i < items.length; i++) {
           Item find = items[i];
           if (find != null && find.getId().equals(id)) {
               result = find;
           }
       } return result;
    }
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                System.arraycopy(items, i, this.items, i + 1, items.length - 1);
                result = true;
                break;
            }
        } return result;
    }
    public Item[] findByName(String key) {
        Item[] find = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                find[i] = items[i];
                break;
            }

        } return find;
    }
    public Item[] findAll() {
        System.out.println(Arrays.toString(items));
        return items;
    }
}

