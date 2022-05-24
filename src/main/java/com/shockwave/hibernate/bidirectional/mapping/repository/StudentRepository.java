package com.shockwave.hibernate.bidirectional.mapping.repository;

import com.shockwave.hibernate.bidirectional.mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
