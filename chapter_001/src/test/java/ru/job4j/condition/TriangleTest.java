package ru.job4j.condition;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(4,2);
        Point b = new Point(6,12);
        Point c = new Point(2,4);
        Triangle triangle = new Triangle(a,b,c);
         double result = triangle.area();
        assertThat(result, is(11.999999999999991));

    }
}
