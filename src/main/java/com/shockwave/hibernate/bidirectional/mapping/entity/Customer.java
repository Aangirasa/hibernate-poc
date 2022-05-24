package com.shockwave.hibernate.bidirectional.mapping.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Customer {
    @Id
    public Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_fk")
    public Passport passport;
}
