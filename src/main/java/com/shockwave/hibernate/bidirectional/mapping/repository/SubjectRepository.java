package com.shockwave.hibernate.bidirectional.mapping.repository;

import com.shockwave.hibernate.bidirectional.mapping.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,String> {
}
