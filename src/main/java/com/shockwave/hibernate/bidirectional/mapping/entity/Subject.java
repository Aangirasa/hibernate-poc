package com.shockwave.hibernate.bidirectional.mapping.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = {"course"})
public class Subject {
    @Id
    private String id;
    private String name;
    @ManyToMany(mappedBy = "subjects",fetch = FetchType.EAGER)
    private List<Lecturer> lecturers=new ArrayList<>();
    @ManyToOne
    private Course course;
}
