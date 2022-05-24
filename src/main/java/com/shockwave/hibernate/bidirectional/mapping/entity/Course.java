package com.shockwave.hibernate.bidirectional.mapping.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = "students")
public class Course {
    @Id
    private String id;
    private String name;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id")
    private List<Subject> subjects = new ArrayList<>();
    @OneToMany(mappedBy = "course")
    private List<Student> students = new ArrayList<>();
}
