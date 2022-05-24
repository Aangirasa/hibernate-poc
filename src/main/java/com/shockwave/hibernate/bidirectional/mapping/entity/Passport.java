package com.shockwave.hibernate.bidirectional.mapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Passport {
    @Id
    private Integer id;
    @OneToOne(mappedBy = "passport")
    private Customer customer;
}
