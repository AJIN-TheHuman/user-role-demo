package com.example.usertest.mapper;

import com.example.usertest.dto.AddressDto;
import com.example.usertest.entity.Address;
import com.example.usertest.reponse.AddressRes;
import com.example.usertest.request.AddressReq;
import org.springframework.stereotype.Component;

@Component
public class AddressMapperImpl implements AddressMapper {


    @Override
    public AddressDto toAddressDto(AddressReq addressRes) {
        AddressDto addressDto = new AddressDto();
        addressDto.setZipCode(addressRes.getZipCode());
        addressDto.setStreetName(addressRes.getStreetName());
        addressDto.setPhoneNumber(addressRes.getPhoneNumber());
        addressDto.setEmail(addressRes.getEmail());
        return addressDto;
    }


    @Override
    public Address toAddressEntity(AddressDto addressDto) {
        Address address = new Address();
        address.setZipCode(addressDto.getZipCode());
        address.setStreetName(addressDto.getStreetName());
        address.setPhoneNumber(addressDto.getPhoneNumber());
        address.setEmail(addressDto.getEmail());
        return address;
    }

    @Override
    public AddressDto toAddressDto(Address saveAddress) {
        if (saveAddress == null) {
            return null;
        }

        AddressDto addressDto = new AddressDto();
        addressDto.setId(saveAddress.getId());
        addressDto.setZipCode(saveAddress.getZipCode());
        addressDto.setStreetName(saveAddress.getStreetName());
        addressDto.setPhoneNumber(saveAddress.getPhoneNumber());
        addressDto.setEmail(saveAddress.getEmail());
        return addressDto;
    }

    @Override
    public AddressRes toAddressRes(AddressDto savedAddress) {
        AddressRes addressRes = new AddressRes();
        addressRes.setId(savedAddress.getId());
        addressRes.setZipCode(savedAddress.getZipCode());
        addressRes.setStreetName(savedAddress.getStreetName());
        addressRes.setPhoneNumber(savedAddress.getPhoneNumber());
        addressRes.setEmail(savedAddress.getEmail());
        return addressRes;
    }

}
