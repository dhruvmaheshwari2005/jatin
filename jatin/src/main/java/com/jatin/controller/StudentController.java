package com.jatin.controller;

import com.jatin.model.Student;
import com.jatin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public List<Student> getStudent(@PathVariable int studentId) {
        return service.getStudent(studentId);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student);
        return service.createStudent(student);
    }

    @PutMapping("/students")
    public Student udpateStudent(@RequestBody Student student) {
        System.out.println(student);
        return service.updateStudent(student);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
        System.out.println(studentId);
        service.deleteStudent(studentId);
    }

}

/**
 * APIs:
 * methods:
 * 1. Get: get the data, get all the students or 1 student by id
 * 2. Post: insert the data in the DB
 * 3. Put: update the existing data
 * 4. Delete: delete the data
 */
