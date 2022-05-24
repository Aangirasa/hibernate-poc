package com.shockwave.hibernate.sharedprimarykeys.repository;

import com.shockwave.hibernate.sharedprimarykeys.entity.Body;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyRepository extends JpaRepository<Body,Integer> {
}
