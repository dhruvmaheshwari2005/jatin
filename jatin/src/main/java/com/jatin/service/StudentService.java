package com.jatin.service;

import com.jatin.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.jatin.model.Student;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student createStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getStudent(int id) {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(id);
        return repo.findAllById(ids);
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    public void deleteStudent(int studentId) {
        repo.deleteById(studentId);
    }
}
