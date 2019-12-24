package ru.job4j.stream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MatrixToListTest {
    @Test
    public void profileToAddressWithSortAndDist() {
        MatrixToList test = new MatrixToList();
        Integer[][] arr = {{1, 2}, {3, 4}};
        List<Integer> res = test.convert(arr);
        List<Integer> exp = List.of (1, 2, 3, 4);
        assertThat ( res, is ( exp ) );
    }

}
