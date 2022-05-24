package com.shockwave.hibernate.bidirectional.mapping.entity;

import com.shockwave.hibernate.bidirectional.mapping.value.Address;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(exclude = {"lecturers"})
@Entity
@Table(name = "student")
public class Student {
    @Id
    private Long id;
    private String name;
    private int age;
    @Embedded
    private Address address;
    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;
    @ManyToMany(mappedBy = "students")
    private List<Lecturer> lecturers=new ArrayList<>();
}
