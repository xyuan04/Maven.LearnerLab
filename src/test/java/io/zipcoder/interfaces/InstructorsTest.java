package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstanceTest() {
        //Given:
        Instructors zipCodeInstructors = Instructors.getInstance();

        //When:
        int actual = zipCodeInstructors.count();

        //Then:
        Assert.assertEquals(3, actual, 0.000001);
    }

    @Test
    public void getInstanceGetNameTest() {
        //Given:
        Instructors zipCodeInstructors = Instructors.getInstance();

        //When:
        String expected = "Dolio";
        String actual = zipCodeInstructors.findByID(100).getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInstanceGetNameTest2() {
        //Given:
        Instructors zipCodeInstructors = Instructors.getInstance();

        //When:
        String expected = "Kris";
        String actual = zipCodeInstructors.findByID(200).getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInstanceGetNameTest3() {
        //Given:
        Instructors zipCodeInstructors = Instructors.getInstance();

        //When:
        String expected = "Nobles";
        String actual = zipCodeInstructors.findByID(300).getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }
}