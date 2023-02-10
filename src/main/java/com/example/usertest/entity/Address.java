package com.example.usertest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String zipCode;
    private String streetName;
    private String phoneNumber;
    private String email;

    @ManyToOne
    private UserEntity userEntity;

    public Address() {
    }
}
