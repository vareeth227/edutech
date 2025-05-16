package com.edutech.cl.edutech.repository;

import com.edutech.cl.edutech.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
