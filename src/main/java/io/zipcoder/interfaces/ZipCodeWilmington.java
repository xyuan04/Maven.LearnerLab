package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor hostInstructor = (Instructor) instructors.findByID(id);

        hostInstructor.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<Student, Double>();
        Iterator<Student> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            Double totalStudyTime = currentStudent.getTotalStudyTime();
            map.put(currentStudent, totalStudyTime);
        }

        return map;
    }
}
