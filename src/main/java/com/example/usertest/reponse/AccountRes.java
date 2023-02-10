package com.example.usertest.reponse;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class AccountRes {

    private Integer id;
    private String accountName;
    private String password;
    private String phoneNumber;
    private LocalDate createdDate;

}
