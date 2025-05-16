package com.edutech.cl.edutech.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
}
