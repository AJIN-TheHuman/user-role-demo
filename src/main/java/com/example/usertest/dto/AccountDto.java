package com.example.usertest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class AccountDto implements Serializable {

    private Integer id;
    private String accountName;
    private String password;
    private String phoneNumber;
    private LocalDate createdDate;

}
