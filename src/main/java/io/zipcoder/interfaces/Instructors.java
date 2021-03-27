package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor dolio = Educator.DOLIO.getInstructor();
        Instructor younger = Educator.YOUNGER.getInstructor();
        Instructor nobles = Educator.NOBLES.getInstructor();

        this.add(dolio);
        this.add(younger);
        this.add(nobles);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] toArray() {
        Instructor[] personArray = new Instructor[this.getPersonList().size()];
        int index = 0;
        for(Instructor person: this.getPersonList()) {
            personArray[index] = person;
            index++;
        }

        return personArray;
    }
}
