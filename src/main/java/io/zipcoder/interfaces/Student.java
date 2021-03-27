package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime = 0;

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numbersOfHours) {
        totalStudyTime += numbersOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void clearStudyTime() {
        totalStudyTime = 0;
    }

    @Override
    public String toString() {
        return String.format("\nStudent: \n\tName: %s\n\tID: %s\n\tStudy Time: %f",this.getName(), this.getId(), this.getTotalStudyTime());
    }
}
