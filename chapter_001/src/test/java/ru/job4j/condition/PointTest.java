package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int in = 0;
        int in2 = 0;
        int in3 = 2;
        int in4 = 0;
        double expected = 3.0;
        double out = Point.distance(in, in2,in3,in4);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance2() {
        int in = 1;
        int in2 = 2;
        int in3 = 6;
        int in4 = 18;
        double expected = 16.76;
        double out = Point.distance(in, in2,in3,in4);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance3() {
        int in = 6;
        int in2 = 1;
        int in3 = 8;
        int in4 = 12;
        double expected = 11.18;
        double out = Point.distance(in, in2,in3,in4);
        Assert.assertEquals(expected, out, 0.01);
    }

}