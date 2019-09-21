package ru.job4j.condition;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenExist1() {
        boolean result = Triangle.exist(3.0, 1.0, 2.0);
        assertThat(result, is(false));
    }
}
