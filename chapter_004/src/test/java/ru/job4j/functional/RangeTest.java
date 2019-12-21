package ru.job4j.functional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class RangeTest {
    @Test
    public void LinearFunction() {
        Range rang = new Range();
        List<Double> result = rang.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = new ArrayList<>();
        expected.add(11D);
        expected.add(13D);
        expected.add(15D);
        assertThat(result, is(expected));
    }
    @Test
    public void QuadFunction() {
        Range rang = new Range();
        List<Double> result = rang.diapason(5, 8, x -> 2 * (x * x) + 2 * x + 5);
        List<Double> expected = new ArrayList<>();
        expected.add(65D);
        expected.add(89D);
        expected.add(117D);
        assertThat(result, is(expected));
    }
    @Test
    public void LogarithmFunction() {
        Range rang = new Range();
        List<Double> result = rang.diapason(10, 11, x -> Math.log10(x));
        List<Double> expected = new ArrayList<>();
        expected.add(1D);
        assertThat(result, is(expected));
    }

}
