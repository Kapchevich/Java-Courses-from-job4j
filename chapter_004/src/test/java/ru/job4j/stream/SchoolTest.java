package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SchoolTest {
    School school = new School();
    Student a = new Student(95);
    Student b = new Student(90);
    Student c = new Student(75);
    Student d = new Student(65);
    Student e = new Student(55);
    Student f = new Student(60);
    Student g = new Student(45);
    Student h = new Student(20);
    Student i = new Student(30);


    @Test
    public void scoreA() {
        List<Student> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);
        List<Student> res = school.collect(list, s -> s.getScore() > 70);
        List<Student> exp = new ArrayList<>();
        exp.add(a);
        exp.add(b);
        exp.add(c);
        assertThat(res, is(exp));
    }
    @Test
    public void scoreB() {
        List<Student> list = new ArrayList<> ( );
        list.add ( a );
        list.add ( b );
        list.add ( c );
        list.add ( d );
        list.add ( e );
        list.add ( f );
        list.add ( g );
        list.add ( h );
        list.add ( i );
        List<Student> res = school.collect ( list, s -> s.getScore ( ) > 50 && s.getScore ( ) < 70 );
        List<Student> exp = new ArrayList<> ( );
        exp.add ( d );
        exp.add ( e );
        exp.add ( f );
        assertThat ( res, is ( exp ) );
    }
    @Test
    public void scoreC() {
        List<Student> list = new ArrayList<> ( );
        list.add ( a );
        list.add ( b );
        list.add ( c );
        list.add ( d );
        list.add ( e );
        list.add ( f );
        list.add ( g );
        list.add ( h );
        list.add ( i );
        List<Student> res = school.collect ( list, s -> s.getScore ( ) < 50 );
        List<Student> exp = new ArrayList<> ( );
        exp.add ( g );
        exp.add ( h );
        exp.add ( i );
        assertThat ( res, is ( exp ) );
    }

}
