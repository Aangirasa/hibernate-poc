package com.shockwave.hibernate;

import com.shockwave.hibernate.entity.Student;
import com.shockwave.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Tests {
    @Autowired
    private StudentRepository studentRepository;
    @PostConstruct
    public void testInsert(){
        Student student= new Student();
        student.setId(1l);
        student.setName("abc");
        student.setDivision("A");
        student.setGrade("First");
        studentRepository.save(student);
        System.out.println(studentRepository.findById(1l).toString());
    }
}
