package com.edutech.cl.edutech.repository;

import com.edutech.cl.edutech.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
