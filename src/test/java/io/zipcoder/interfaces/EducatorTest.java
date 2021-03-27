package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testImplementation() {
        //Given:
        Educator dolio = Educator.DOLIO;

        //When:

        //Then:
        assertTrue(dolio instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given:

        //When:

        //Then:
        assertTrue(Educator.DOLIO.getInstructor() instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given:
        Educator dolio = Educator.DOLIO;
        Student xiong = new Student(1, "Xiong");

        //When:
        dolio.teach(xiong, 10);

        //Then:
        assertEquals(10, xiong.getTotalStudyTime(), 0.00001);
    }

    @Test
    public void testLecture() {
        //Given:
        Educator dolio = Educator.DOLIO;
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
        Educator dolio = Educator.DOLIO;
        Student xiong = new Student(1, "Xiong");
        Student mike = new Student(2, "Mike");
        Student[] zipCode = new Student[]{xiong, mike};

        //When:
        dolio.lecture(zipCode, 40);

        //Then:
        assertEquals(20, mike.getTotalStudyTime(), 0.00001);
    }

    @Test
    public void testTimeWorked() {
        //Given:
        Educator dolio = Educator.DOLIO;
        Student xiong = new Student(1, "Xiong");
        Student mike = new Student(2, "Mike");
        Student[] zipCode = new Student[]{xiong, mike};

        //When:
        Educator.DOLIO.clearTimeWorked();
        dolio.lecture(zipCode, 40);
        double actual = Educator.DOLIO.getTimeWorked();

        //Then:
        assertEquals(40, actual, 0.00001);
    }

}