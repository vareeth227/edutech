package com.edutech.cl.edutech.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data

public class Student {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String name;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
