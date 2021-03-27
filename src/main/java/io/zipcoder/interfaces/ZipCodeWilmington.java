package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor hostInstructor = (Instructor) instructors.findByID(id);

        hostInstructor.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<Student, Double>();
        Iterator<Person> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            Student currentStudent = (Student) studentIterator.next();
            Double totalStudyTime = currentStudent.getTotalStudyTime();
            map.put(currentStudent, totalStudyTime);
        }

        return map;
    }
}
