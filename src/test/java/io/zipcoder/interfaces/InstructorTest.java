package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        //Given:
        long id = 100;
        String name = "Dolio";

        //When:
        Instructor dolio = new Instructor(id, name);

        //Then:
        assertTrue(dolio instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given:
        long id = 100;
        String name = "Dolio";

        //When:
        Instructor dolio = new Instructor(id, name);

        //Then:
        assertTrue(dolio instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given:
        long id = 100;
        String name = "Dolio";
        Instructor dolio = new Instructor(id, name);
        Student xiong = new Student(1, "Xiong");

        //When:
        dolio.teach(xiong, 10);

        //Then:
        assertEquals(10, xiong.getTotalStudyTime(), 0.00001);
    }

    @Test
    public void testLecture() {
        //Given:
        long id = 100;
        String name = "Dolio";
        Instructor dolio = new Instructor(id, name);
        Student xiong = new Student(1, "Xiong");
        Student mike = new Student(2, "Mike");
        Student[] zipCode = new Student[]{xiong, mike};

        //When:
        dolio.lecture(zipCode, 40);

        //Then:
        assertEquals(20, xiong.getTotalStudyTime(), 0.00001);
    }

    @Test
    public void testLecture2() {
        //Given:
        long id = 100;
        String name = "Dolio";
        Instructor dolio = new Instructor(id, name);
        Student xiong = new Student(1, "Xiong");
        Student mike = new Student(2, "Mike");
        Student[] zipCode = new Student[]{xiong, mike};

        //When:
        dolio.lecture(zipCode, 40);

        //Then:
        assertEquals(20, mike.getTotalStudyTime(), 0.00001);
    }
}