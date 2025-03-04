package com.springjdbc.app.service;

import com.springjdbc.app.model.Student;
import com.springjdbc.app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    public void addStudent(Student student) {
        studentRepo.save(student);
        System.out.println("Student Added");
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
