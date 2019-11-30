package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int i = -1;

        for (Task a : tasks) {
            if (a.getPriority() > task.getPriority()) {
                i = tasks.indexOf(a);
                break;
            }
        }

        if (i != -1) {
            tasks.add(i, task);
        } else {
            tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
