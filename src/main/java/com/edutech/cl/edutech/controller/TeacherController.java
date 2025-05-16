package com.edutech.cl.edutech.controller;

import com.edutech.cl.edutech.model.Teacher;
import com.edutech.cl.edutech.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
