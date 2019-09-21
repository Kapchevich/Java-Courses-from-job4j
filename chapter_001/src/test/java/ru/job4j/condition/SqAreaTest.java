package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int in = 4;
        int in2 = 1;
        double expected = 2.0;
        double out = SqArea.square(in,in2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square2() {
        int in = 6;
        int in2 = 2;
        double expected = 2.0;
        double out = SqArea.square(in,in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

