package com.shockwave.hibernate.bidirectional.mapping.value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private int doorNumber;
    private String street;
    private String city;
    private String state;
    private String pin;
}
