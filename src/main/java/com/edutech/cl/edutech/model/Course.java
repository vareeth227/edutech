package com.edutech.cl.edutech.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data


public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
