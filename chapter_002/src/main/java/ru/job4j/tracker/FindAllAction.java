package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return  "All task";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(tracker.findAll());
        return true;
    }
}
