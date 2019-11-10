package ru.job4j.single;

import ru.job4j.tracker.Item;

public class TrackerSinglePrivateStaticFinalClass {
    private TrackerSinglePrivateStaticFinalClass() {
    }

    public static TrackerSinglePrivateStaticFinalClass getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePrivateStaticFinalClass INSTANCE = new TrackerSinglePrivateStaticFinalClass();
    }
}
