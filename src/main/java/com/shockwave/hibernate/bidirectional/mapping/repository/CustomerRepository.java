package com.shockwave.hibernate.bidirectional.mapping.repository;

import com.shockwave.hibernate.bidirectional.mapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
