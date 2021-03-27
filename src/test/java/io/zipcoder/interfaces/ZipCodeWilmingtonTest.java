package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        //Given:
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        Teacher dolio = new Instructor(100, "Dolio");
        Student xiong = (Student) Students.getInstance().findByID(1);

        //When:
        zipcode.hostLecture(dolio, 40);
        Double totalStudyTime = zipcode.getStudyMap().get(xiong);

        //Then:
        assertEquals(10, totalStudyTime, 0.00001);
    }

    @Test
    public void testHostLecture() {
    }

    @Test
    public void getStudyMap() {
    }
}