package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Create a new task";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("New task created");
        System.out.println("Name: " + item.getName() + "; " + " id: " + item.getId() + ".");
        return true;
    }
}

