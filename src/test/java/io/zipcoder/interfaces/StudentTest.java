package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        //Given:
        long id = 1;
        String name = "Xiong";

        //When:
        Student xiong = new Student(id, name);

        //Then:
        assertTrue(xiong instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //Given:
        long id = 1;
        String name = "Xiong";

        //When:
        Student xiong = new Student(id, name);

        //Then:
        assertTrue(xiong instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given:
        long id = 1;
        String name = "Xiong";
        Student xiong = new Student(id, name);

        //When:
        double expected = 80;
        xiong.learn(expected);
        double actual = xiong.getTotalStudyTime();

        //Then:
        assertEquals(expected, actual, 0.00001);
    }
}