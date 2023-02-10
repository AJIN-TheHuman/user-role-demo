package com.example.usertest.mapper;

import com.example.usertest.dto.AccountDto;
import com.example.usertest.entity.Account;
import com.example.usertest.reponse.AccountRes;
import com.example.usertest.request.AccountReq;
import com.example.usertest.request.AddressReq;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper{
    @Override
    public AccountDto toAccountDto(AccountReq accountRes) {
        AccountDto accountDto = new AccountDto();
//        accountDto.setAccountName(accountRes.);
        return null;
    }

    /*
    *  @Override
    public AddressDto toAddressDto(AddressReq addressRes) {
        AddressDto addressDto = new AddressDto();
        addressDto.setZipCode(addressRes.getZipCode());
        addressDto.setStreetName(addressRes.getStreetName());
        addressDto.setPhoneNumber(addressRes.getPhoneNumber());
        addressDto.setEmail(addressRes.getEmail());
        return addressDto;
    }
*/

    @Override
    public Account toAccountEntity(AccountDto accountDto) {
        return null;
    }

    @Override
    public AccountDto toAccountDto(Account saveAccount) {
        return null;
    }

    @Override
    public AccountRes toAccountRes(AccountDto savedAccount) {
        return null;
    }
}
