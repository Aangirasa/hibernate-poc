package com.shockwave.hibernate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    private Long id;
    private String name;
    private String division;
    private String grade;
}
