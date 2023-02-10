package com.example.usertest.mapper;

import com.example.usertest.dto.AddressDto;
import com.example.usertest.entity.Address;
import com.example.usertest.entity.Role;
import com.example.usertest.reponse.AddressRes;
import com.example.usertest.request.AddressReq;


public interface AddressMapper {

    AddressDto toAddressDto(AddressReq addressReq);

    Address toAddressEntity(AddressDto addressDto);

    AddressDto toAddressDto(Address saveAddress);

    AddressRes toAddressRes(AddressDto savedAddress);


}
