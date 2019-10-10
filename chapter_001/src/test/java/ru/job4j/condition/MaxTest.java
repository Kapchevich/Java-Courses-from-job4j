package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax4() {
        int result = Max.max(8, 6, 3, 12);
        assertThat(result, is(12));
    }
    @Test
    public void whenMax3() {
        int result = Max.max(6, 2, 8);
        assertThat(result, is(8));
    }
    @Test
    public void whenMax2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
}
