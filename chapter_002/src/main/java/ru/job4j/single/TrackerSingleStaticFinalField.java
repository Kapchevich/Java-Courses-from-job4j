package ru.job4j.single;
import ru.job4j.tracker.Item;

public class TrackerSingleStaticFinalField {
    private static final TrackerSingleStaticFinalField INSTANCE = new TrackerSingleStaticFinalField();

    private TrackerSingleStaticFinalField() {
    }

    public static TrackerSingleStaticFinalField getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

}
