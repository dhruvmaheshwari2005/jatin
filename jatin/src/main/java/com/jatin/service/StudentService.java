package com.jatin.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class StudentService {
    public String getStudents() {
        return "Testing getStudents";
    }
}
