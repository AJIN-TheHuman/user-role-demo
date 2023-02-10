package com.example.usertest.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressReq {

    private String zipCode;
    private String streetName;
    private String phoneNumber;
    private String email;
}
