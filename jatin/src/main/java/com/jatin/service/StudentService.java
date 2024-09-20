package com.jatin.service;

import com.jatin.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.jatin.model.Student;
import java.util.List;

@Component
@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public List<Student> getStudents() {
        return repo.findAll();
    }
}
