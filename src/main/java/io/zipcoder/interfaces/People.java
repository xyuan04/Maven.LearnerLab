package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<TypeOfPerson extends Person> implements Iterable<TypeOfPerson>{
    private List<TypeOfPerson> personList = new ArrayList<TypeOfPerson>();

    public void add(TypeOfPerson person) {
        personList.add(person);
    }

    public TypeOfPerson findByID(long id) {
        Iterator<TypeOfPerson> personIterator = iterator();

        while(personIterator.hasNext()) {
            TypeOfPerson currentPerson = personIterator.next();
            if(currentPerson.getId() == id) {
                return currentPerson;
            }
        }
        return null;
    }

    public boolean contains(TypeOfPerson person) {
        Iterator<TypeOfPerson> personIterator = iterator();

        while(personIterator.hasNext()) {
            TypeOfPerson currentPerson = personIterator.next();
            if(currentPerson == person) {
                return true;
            }
        }
        return false;
    }

    public void remove(TypeOfPerson person) {
        Iterator<TypeOfPerson> personIterator = iterator();

        while(personIterator.hasNext()) {
            TypeOfPerson currentPerson = personIterator.next();
            if(currentPerson == person) {
                personList.remove(currentPerson);
                break;
            }
        }
    }

    public void remove(long id) {
        Iterator<TypeOfPerson> personIterator = iterator();

        while(personIterator.hasNext()) {
            TypeOfPerson currentPerson = personIterator.next();
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

    public abstract TypeOfPerson[] toArray();

    public List<TypeOfPerson> getPersonList() {
        return personList;
    }

    public Iterator<TypeOfPerson> iterator() {
        return personList.iterator();
    }
}
