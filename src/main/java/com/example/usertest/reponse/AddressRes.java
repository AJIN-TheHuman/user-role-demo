package com.example.usertest.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRes {
    private Integer id;
    private String zipCode;
    private String streetName;
    private String phoneNumber;
    private String email;
}
