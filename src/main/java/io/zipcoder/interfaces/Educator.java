package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    DOLIO(100, "Dolio"),
    YOUNGER(200, "Kris"),
    NOBLES(300, "Nobles");

    private Instructor instructor;
    private double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void clearTimeWorked() {
        timeWorked = 0;
    }
    public double getTimeWorked() {
        return timeWorked;
    }
}
