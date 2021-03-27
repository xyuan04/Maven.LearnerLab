package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstanceTest() {
        //Given:
        Students zipCodeStudents = Students.getInstance();

        //When:
        int actual = zipCodeStudents.count();

        //Then:
        Assert.assertEquals(4, actual, 0.000001);
    }

    @Test
    public void getInstanceGetNameTest() {
        //Given:
        Students zipCodeStudents = Students.getInstance();

        //When:
        String expected = "Xiong";
        String actual = zipCodeStudents.findByID(1).getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }


}