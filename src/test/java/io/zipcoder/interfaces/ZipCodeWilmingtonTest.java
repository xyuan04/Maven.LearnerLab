package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureWithID() {
        //Given:
        ZipCodeWilmington zipcode = new ZipCodeWilmington();

        //When:
        Students.getInstance().clearAllStudyTime();
        zipcode.hostLecture(100, 40);
        Double totalStudyTime = (Students.getInstance().findByID(1)).getTotalStudyTime();

        //Then:
        assertEquals(10, totalStudyTime, 0.00001);
    }

    @Test
    public void testHostLectureWithInstructor() {
        //Given:
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        Teacher younger = Instructors.getInstance().findByID(200);

        //When:
        Students.getInstance().clearAllStudyTime();
        zipcode.hostLecture(younger, 80);
        Double totalStudyTime = (Students.getInstance().findByID(1)).getTotalStudyTime();

        //Then:
        assertEquals(20, totalStudyTime, 0.00001);
    }

    @Test
    public void getStudyMap() {
        //Given:
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        Student xiong = Students.getInstance().findByID(1);

        //When:
        Students.getInstance().clearAllStudyTime();
        zipcode.hostLecture(100, 100);
        double expected = 25;
        double actual = zipcode.getStudyMap().get(xiong);

        //Then:
        Assert.assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testHostLectureWithInstructorENUM() {
        //Given:
        ZipCodeWilmington zipcode = new ZipCodeWilmington();

        //When:
        Students.getInstance().clearAllStudyTime();
        zipcode.hostLecture(Educator.DOLIO, 80);
        Double totalStudyTime = ((Student) Students.getInstance().findByID(1)).getTotalStudyTime();

        //Then:
        assertEquals(20, totalStudyTime, 0.00001);
    }

    @Test
    public void getStudyMapENUM() {
        //Given:
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        Student xiong = Students.getInstance().findByID(1);

        //When:
        Students.getInstance().clearAllStudyTime();
        zipcode.hostLecture(Educator.YOUNGER, 100);
        double expected = 25;
        double actual = zipcode.getStudyMap().get(xiong);

        //Then:
        Assert.assertEquals(expected, actual, 0.00001);
    }
}