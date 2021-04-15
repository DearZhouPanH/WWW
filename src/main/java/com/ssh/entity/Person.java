package com.ssh.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "justtest")
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

}
