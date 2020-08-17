package com.Dal;

import com.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentDal {
    private static Map<Integer, Student>student;
    static {
        student=new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Sal", "Computer"));
                put(2, new Student(2, "Tal", "Computer"));
                put(3, new Student(3, "Mal", "Computer"));
            }
        };
    }
    public Collection<Student> getAllStudents(){

        return this.student.values();
    }
    public Student getStudentById(int id){
        return this.student.get(id);
    }

    public void removeStudentById(int id) {
        this.student.remove(id);
    }

    public void updateStudent(Student students){
        Student s=student.get(students.getId());
        s.setCourse(students.getCourse());
        s.setName(students.getName());
        student.put(students.getId(),students);
    }

    public void addStudent(Student students) {
        this.student.put(students.getId(), students);
    }
}
