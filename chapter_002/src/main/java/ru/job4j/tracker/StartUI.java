package ru.job4j.tracker;
import java.util.Arrays;

public class StartUI  {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Name: " + item.getName() + " id " + item.getId());
    }
    public static void replaceItem (Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        System.out.println(" Enter name and id ");
        String name = input.askStr("");
        String id = input.askStr("");
        Item next = new Item(name);
        next.setId(id);
        if (tracker.replace(next.getId(), next)) {
            System.out.println("Task has been changed");
        } else {
            System.out.println("Task not found");
        }
    }
    public static void findAllItem (Input input, Tracker tracker) {
        System.out.println("=== All items ====");
        System.out.println(tracker.findAll());
    }
    public static void deleteItem (Input input, Tracker tracker) {
        System.out.print("Enter items id: ");
        String id = input.askStr("");
        if (tracker.delete(id)) {
            System.out.println("Task has been deleted.");
        } else {
            System.out.println("Task not found");
        }
    }
    public static void findItemById (Input input, Tracker tracker) {
        System.out.println("=== Search by id ====");
        System.out.print("Enter id: ");
        String id = input.askStr("");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Search results");
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("Task not found");
        }
    }
    public static void findItemByName (Input input, Tracker tracker) {
        System.out.println("=== Search by name ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        for (Item item: tracker.findByName(name)) {
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));

            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);

            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);


            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);

            } else if (select == 6) {
                run = false;
                System.out.println("=== Program is closed ===");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
    public static void main(String[] args) {
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            new StartUI().init(input, tracker);
    }
}
