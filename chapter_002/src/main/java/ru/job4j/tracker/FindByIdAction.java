package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Search task by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter task id: ");
        String id = input.askStr("");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Search results");
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("Task not found");
        }
        return true;
    }
}
