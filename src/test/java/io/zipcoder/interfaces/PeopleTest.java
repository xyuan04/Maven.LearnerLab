package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    Instructor dolio = new Instructor(100, "Dolio");
    Student xiong = new Student(1, "Xiong");
    Student mike = new Student(2, "Mike");

    @Test
    public void testAddAndCount() {
        //Given:
        People people = new People();

        //When:
        people.add(dolio);
        people.add(xiong);
        people.add(mike);

        //Then:
        assertTrue(people.count() == 3);
    }

    @Test
    public void testAddAndContains() {
        //Given:
        People people = new People();

        //When:
        people.add(dolio);
        people.add(xiong);
        people.add(mike);

        //Then:
        assertTrue(people.contains(xiong));
    }

    @Test
    public void testAddAndContainsFalse() {
        //Given:
        People people = new People();
        Instructor younger = new Instructor(101, "Kris");

        //When:
        people.add(dolio);
        people.add(xiong);
        people.add(mike);

        //Then:
        assertFalse(people.contains(younger));
    }

    @Test
    public void testRemoveContains() {
        //Given:
        People people = new People();
        people.add(dolio);
        people.add(xiong);
        people.add(mike);

        //When:

        people.remove(dolio);

        //Then:
        assertFalse(people.contains(dolio));
    }

    @Test
    public void testRemoveCount() {
        //Given:
        People people = new People();
        people.add(dolio);
        people.add(xiong);
        people.add(mike);

        //When:
        people.remove(dolio);

        //Then:
        assertTrue(people.count() == 2);
    }

    @Test
    public void testFindById() {
        //Given:
        People people = new People();
        people.add(dolio);
        people.add(xiong);
        people.add(mike);

        //When:

        Person actual = people.findByID(1);

        //Then:
        assertEquals(xiong, actual);
    }

}