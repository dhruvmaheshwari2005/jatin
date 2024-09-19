package com.jatin.controller;

import com.jatin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public String getStudents() {
        return service.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public String getStudent(@PathVariable int studentId) {
        return ""+studentId;
    }

    @PostMapping
    public void createStudent() {

    }

}

/**
 * APIs:
 * methods:
 * 1. Get: get the data, get all the students or 1 student by id
 * 2. Post: insert the data in the DB
 * 3. Put: update the existing data
 * 4. Delete: delete the data
 *
 */
