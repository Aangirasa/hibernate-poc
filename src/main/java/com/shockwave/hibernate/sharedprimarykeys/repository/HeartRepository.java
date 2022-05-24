package com.shockwave.hibernate.sharedprimarykeys.repository;

import com.shockwave.hibernate.sharedprimarykeys.entity.Heart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRepository extends JpaRepository<Heart,Integer> {
}
