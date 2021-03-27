package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testContructorGetName() {
        //Given:
        long id = 1;
        String name = "Xiong";

        //When:
        Person xiong = new Person(id, name);

        //Then:
        Assert.assertEquals(name, xiong.getName());
    }

    @Test
    public void testContructorGetId() {
        //Given:
        long id = 1;
        String name = "Xiong";

        //When:
        Person xiong = new Person(id, name);

        //Then:
        Assert.assertEquals(id, xiong.getId());
    }

    @Test
    public void testSetName() {
        //Given:
        long id = 1;
        String name = "Xiong";
        Person xiong = new Person(id, name);

        //When:
        String expected = "Shawn";
        xiong.setName(expected);

        //Then:
        Assert.assertEquals(expected, xiong.getName());
    }

}
