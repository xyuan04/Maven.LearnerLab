package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    private List<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findByID(long id) {
        Iterator<Person> personIterator = iterator();

        while(personIterator.hasNext()) {
            Person currentPerson = personIterator.next();
            if(currentPerson.getId() == id) {
                return currentPerson;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        Iterator<Person> personIterator = iterator();

        while(personIterator.hasNext()) {
            Person currentPerson = personIterator.next();
            if(currentPerson == person) {
                return true;
            }
        }
        return false;
    }

    public void remove(Person person) {
        Iterator<Person> personIterator = iterator();

        while(personIterator.hasNext()) {
            Person currentPerson = personIterator.next();
            if(currentPerson == person) {
                personList.remove(currentPerson);
                break;
            }
        }
    }

    public void remove(long id) {
        Iterator<Person> personIterator = iterator();

        while(personIterator.hasNext()) {
            Person currentPerson = personIterator.next();
            if(currentPerson.getId() == id) {
                personList.remove(currentPerson);
                break;
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return (Person[]) personList.toArray();
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
