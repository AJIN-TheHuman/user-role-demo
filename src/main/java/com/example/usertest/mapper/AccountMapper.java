package com.example.usertest.mapper;

import com.example.usertest.dto.AccountDto;
import com.example.usertest.entity.Account;
import com.example.usertest.reponse.AccountRes;
import com.example.usertest.request.AccountReq;
import com.example.usertest.request.AddressReq;

public interface AccountMapper {

    AccountDto toAccountDto(AccountReq accountReq);

    Account toAccountEntity(AccountDto accountDto);

    AccountDto toAccountDto(Account saveAccount);

    AccountRes toAccountRes(AccountDto savedAccount);

}
