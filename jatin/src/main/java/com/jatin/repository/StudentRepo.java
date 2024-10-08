package com.jatin.repository;

import com.jatin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
