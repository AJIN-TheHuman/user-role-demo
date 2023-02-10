package com.example.usertest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AddressDto implements Serializable {
    private Integer id;
    private String zipCode;
    private String streetName;
    private String phoneNumber;
    private String email;
}
