package com.shockwave.hibernate.bidirectional.mapping.repository;

import com.shockwave.hibernate.bidirectional.mapping.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<Lecturer,String> {
}
