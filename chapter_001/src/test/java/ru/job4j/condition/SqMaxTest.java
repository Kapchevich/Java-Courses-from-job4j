package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class SqMaxTest {
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(16, 4, 6, 8);
        assertThat(result, is(16));
    }
    @Test
    public void whenSecondMax1() {
        SqMax check = new SqMax();
        int result = check.max(13, 18, 15, 1);
        assertThat(result, is(18));
    }
    @Test
    public void whenSecondMax2() {
        SqMax check = new SqMax();
        int result = check.max(8, 4, 15, 9);
        assertThat(result, is(15));
    }
    @Test
    public void whenSecondMax3() {
        SqMax check = new SqMax();
        int result = check.max(15, 31, 6, 46);
        assertThat(result, is(46));
    }
    @Test
    public void whenSecondMax4() {
        SqMax check = new SqMax();
        int result = check.max(15, 15, 15, 15);
        assertThat(result, is(15));
    }
}
