package ru.job4j.functional;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Range {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (double x = start; x != end; x++) {
            double y = func.apply(x);
            list.add(y);
        }
        return list;

    }
}
