package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor dolio = new Instructor(100, "Dolio");
        Instructor younger = new Instructor(200, "Kris");
        Instructor nobles = new Instructor(300, "Nobles");

        this.add(dolio);
        this.add(younger);
        this.add(nobles);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
