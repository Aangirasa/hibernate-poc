package com.shockwave.hibernate.bidirectional.mapping.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = {"subjects", "students"})
public class Lecturer {
    @Id
    private String id;
    private String name;
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "lecturer_id")
    )
    private List<Subject> subjects = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
    joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "lecturer_id")
    )
    private List<Student> students = new ArrayList<>();
}
