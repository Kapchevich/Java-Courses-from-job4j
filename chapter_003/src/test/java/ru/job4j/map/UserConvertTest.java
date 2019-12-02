package ru.job4j.map;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
        @Test
        public void when2on2ArrayThenList4() {
            UserConvert convert = new UserConvert();
            User first = new User("Anton", "Msc", 1);
            User second = new User("Mikhail", "SPB", 2);
            List<User> list = Arrays.asList(first, second);
            HashMap<Integer, User> result = convert.process(list);
            HashMap<Integer, User> expect = new HashMap<>();
            expect.put(1,first);
            expect.put(2,second);
            assertThat(result, is(expect));


        }
    }

