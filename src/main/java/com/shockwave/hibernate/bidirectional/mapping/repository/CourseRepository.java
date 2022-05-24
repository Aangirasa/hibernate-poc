package com.shockwave.hibernate.bidirectional.mapping.repository;

import com.shockwave.hibernate.bidirectional.mapping.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String> {
}
