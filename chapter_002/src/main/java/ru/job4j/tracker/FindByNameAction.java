package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Search task by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter task name: ");
        String name = input.askStr("");
        for (Item item: tracker.findByName(name)) {
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        }
        return true;
    }
}
