package com.Service;

import com.Dal.StudentDal;
import com.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDal studentDal;

    public Collection<Student> getAllStudents() {

        return this.studentDal.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDal.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDal.removeStudentById(id);
    }
    public void updateStudent(Student students){
        this.studentDal.updateStudent(students);
    }

    public void addStudent(Student students) {
       this.studentDal.addStudent(students);
    }
}
