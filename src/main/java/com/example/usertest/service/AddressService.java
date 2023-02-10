package com.example.usertest.service;


import com.example.usertest.dto.AddressDto;

public interface AddressService {

    AddressDto createAddress(AddressDto addressDto) ;

    AddressDto getAddressById(int id);

    AddressDto updateAddress(int id,AddressDto addressDto);

    void deleteUser(int id);
}
