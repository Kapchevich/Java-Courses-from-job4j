package ru.job4j.lambda;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupTest {
    Group group = new Group ();
    Student student1 = new Student("Misha", Set.of ("Athletics", "Basketball"));
    Student student2 = new Student ("Anton", Set.of ("Athletics", "Biology"));
    Student student3 = new Student ("Vova", Set.of ("Programming", "Biology"));
    Student student4 = new Student ("Andreya", Set.of ("Programming", "Basketball"));
    List<Student> studentList = List.of (student1,student2,student3,student4);

    @Test
    public void test() {
        Map<String, Set<String>> res = group.sections(studentList);
        Map<String, Set<String>> exp = Map.of("Athletics", Set.of ("Anton", "Misha"), "Programming", Set.of ("Andreya", "Vova"), "Biology", Set.of ("Anton", "Vova"), "Basketball", Set.of ("Andreya", "Misha"));
        assertThat(res, is (exp));
    }

}
