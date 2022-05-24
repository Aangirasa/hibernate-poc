package com.shockwave.hibernate.sharedprimarykeys.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "body")
@ToString
public class Body {
    @Id
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Heart heart;
}
