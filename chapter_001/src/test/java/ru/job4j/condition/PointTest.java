package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void d3() {
        Point a = new Point(6, 2, 5);
        Point b = new Point(4, 5, 8);
        double result3d = a.distance3d(b);
        assertThat(result3d, is(4.69041575982343));
    }
    @Test
    public void d2() {
        Point a = new Point(8,4);
        Point b = new Point(4, 12);
        double result = a.distance(b);
        assertThat(result, is(8.94427190999916));
    }
}