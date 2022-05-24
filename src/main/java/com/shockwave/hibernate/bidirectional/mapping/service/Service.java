package com.shockwave.hibernate.bidirectional.mapping.service;

import com.shockwave.hibernate.bidirectional.mapping.entity.*;
import com.shockwave.hibernate.bidirectional.mapping.repository.*;
import com.shockwave.hibernate.bidirectional.mapping.value.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private LecturerRepository lecturerRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public void create() {
        Student student = new Student();
        student.setId(1l);
        student.setName("Morty Smith");
        Address address =new Address(832,"Livingston ave","North brunswick","New Mexico","0891");
        student.setAge(16);
        student.setAddress(address);
        studentRepository.save(student);

        Course course = new Course();
        Subject subject = new Subject();
        subject.setId("pcd");
        subject.setName("pcd");
        subject.setCourse(course);
        course.setId("1PCD15");
        course.setName("1st sem");
        course.setSubjects(Arrays.asList(subject));
        courseRepository.save(course);

        student.setCourse(course);
        studentRepository.save(student);

        Lecturer lecturer = new Lecturer();
        lecturer.setId("rsg");
        lecturer.setName("rgv");
        lecturer.setSubjects(Arrays.asList(subject));
        lecturer.setStudents(Arrays.asList(student));
        lecturerRepository.save(lecturer);

        System.out.println(studentRepository.findById(1l).toString());
    }

    @Transactional
    public void createCustomer(){
        Customer customer = new Customer();
        customer.setId(10);
        Passport passport = new Passport();
        passport.setId(1463374);
        passport.setCustomer(customer);
        customer.setPassport(passport);
        customerRepository.save(customer);
        System.out.println(customerRepository.findById(10).toString());
    }
}
