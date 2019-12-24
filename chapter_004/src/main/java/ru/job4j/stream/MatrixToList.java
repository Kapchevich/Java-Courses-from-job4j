package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public List<Integer> convert(Integer[][] arr) {
        List<Integer> integerList = Arrays.stream(arr).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList());
        return integerList;
    }
}
