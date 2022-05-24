package com.shockwave.hibernate.bidirectional.mapping.repository;

import com.shockwave.hibernate.bidirectional.mapping.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassPortRepository extends JpaRepository<Passport,Integer> {
}
