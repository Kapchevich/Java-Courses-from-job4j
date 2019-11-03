package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "Edit task";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(" Enter task name and id ");
        String name = input.askStr("");
        String id = input.askStr("");
        Item next = new Item(name);
        next.setId(id);
        if (tracker.replace(next.getId(), next)) {
            System.out.println("Task has been changed");
        } else {
            System.out.println("Task not found");
        }
        return true;
    }
}
