package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete task";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter task id: ");
        String id = input.askStr("");
        if (tracker.delete(id)) {
            System.out.println("Task has been deleted.");
        } else {
            System.out.println("Task not found");
        }
        return true;
    }
}
